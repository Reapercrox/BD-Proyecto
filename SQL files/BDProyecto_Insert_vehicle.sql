CREATE OR REPLACE PROCEDURE ADM.insert_vehicle(
    p_seat_quantity IN NUMBER,
    p_brand IN NVARCHAR2,
    p_car_model IN NVARCHAR2,
    p_color IN NVARCHAR2,
    p_plate_number IN NVARCHAR2,
    p_out_code OUT NVARCHAR2
    ) AS
        v_driver_id NUMBER;
        v_person_id NUMBER;
        v_plate_exist NUMBER;
    BEGIN  
        BEGIN
            SELECT id_person_fk
            INTO v_person_id
            FROM ADM.user_Session
            WHERE active_session = 1;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                p_out_code := 1;
                RETURN;
        END;
        
        BEGIN
            SELECT id_driver
            INTO v_driver_id
            FROM ADM.driver
            WHERE id_person_fk = v_person_id;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                p_out_code := 1;
                RETURN;
        END;
        
        SELECT COUNT(*)
        INTO v_plate_exist
        FROM ADM.vehicle
        WHERE plate_number = p_plate_number;
            
        IF v_plate_exist > 0 THEN
        
            p_out_code := 1;

            RETURN;
        
        END IF;
               
        INSERT INTO ADM.vehicle(
            id_vehicle,
            seat_quantity,
            brand,
            car_model,
            color,
            plate_number,
            id_driver_fk
        ) VALUES(
            s_vehicle.nextval,
            p_seat_quantity,
            p_brand,
            p_car_model,
            p_color,
            p_plate_number,
            v_driver_id
        );
        
        UPDATE user_session
        SET expiration_time = expiration_time + INTERVAL '30' MINUTE
        WHERE active_session = 1;
        
        COMMIT;
        
        p_out_code := 1;
        
        EXCEPTION
            WHEN OTHERS THEN
                ROLLBACK; 
                p_out_code := 0;
                RAISE;
                
    END insert_vehicle;

    
            