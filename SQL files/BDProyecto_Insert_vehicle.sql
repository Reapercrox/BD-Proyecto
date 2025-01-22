CREATE OR REPLACE PROCEDURE ADM.insert_vehicle(
    p_seat_quantity IN NUMBER,
    p_brand IN NVARCHAR2,
    p_car_model IN NVARCHAR2,
    p_color IN NVARCHAR2,
    p_plate_number IN NVARCHAR2,
    p_confirmation_email IN NVARCHAR2,--WILL BE USED TO LOCATE THE DRIVER ID
    p_out_code OUT NVARCHAR2
    ) AS
        v_driver_id NUMBER;
        v_plate_exist NUMBER;
    BEGIN  
        SELECT id_driver
        INTO v_driver_id
        FROM ADM.driver d
        JOIN ADM.person p ON d.id_person_fk = p.id_person
        WHERE institutional_email = p_confirmation_email;
        
        SELECT COUNT(*)
        INTO v_plate_exist
        FROM ADM.vehicle
        WHERE plate_number = p_plate_number;
            
        IF v_plate_exist > 0 THEN
        
            p_out_code := 0;
            RETURN;
        
        END IF;
               
        INSERT INTO ADM.vehicle(
            seat_quantity,
            brand,
            car_model,
            color,
            plate_number,
            id_driver_fk
        ) VALUES(
            p_seat_quantity,
            p_brand,
            p_car_model,
            p_color,
            p_plate_number,
            (SELECT id_driver FROM ADM.driver WHERE id_person_fk = v_driver_id)
        );
        
        COMMIT;
        
        p_out_code := 1;
        
        EXCEPTION
            WHEN OTHERS THEN
                ROLLBACK; 
                p_out_code := 0;
                RAISE;
                
    END insert_vehicle;

    
            