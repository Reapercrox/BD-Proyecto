CREATE OR REPLACE PROCEDURE insert_route_data (
    p_day DATE,
    p_start_time IN TIMESTAMP,
    p_end_time IN TIMESTAMP,
    p_available_spaces IN NUMBER,
    p_payment_type NVARCHAR2,
    p_amount IN NUMBER,
    p_location_name IN VARCHAR2,
    p_road_name IN VARCHAR2,
    p_relevant_location_1 IN VARCHAR2,
    p_relevant_location_2 IN VARCHAR2,
    p_end_point IN NVARCHAR2,
    p_plate_number IN NVARCHAR2,
    
    p_out_code OUT  NUMBER
) AS

    v_estimated_time INTERVAL DAY TO SECOND;
    v_person_id NUMBER;
    v_vehicle_id NUMBER;
    
BEGIN

    IF p_payment_type = 'Efectivo' THEN
        INSERT INTO payment_method (
                    id_payment_method,
                    payment_type,
                    amount)
        VALUES (
                    s_payment_method.nextval,
                    0,
                    p_amount);
    ELSIF p_payment_type = 'SINPE' THEN
        INSERT INTO payment_method (
                    id_payment_method,
                    payment_type,
                    amount)
        VALUES (
                    s_payment_method.nextval,
                    1,
                    p_amount);
    ELSIF p_payment_type = 'Transferencia' THEN
        INSERT INTO payment_method (
                    id_payment_method,
                    payment_type,
                    amount)
        VALUES (
                    s_payment_method.nextval,
                    2,
                    p_amount);
    END IF;
                

    v_estimated_time:= p_end_time - p_start_time;
        
    SELECT id_person_fk
    INTO v_person_id
    FROM user_session
    WHERE active_session = 1
    AND ROWNUM = 1;
    
    
    SELECT id_vehicle
    INTO v_vehicle_id
    FROM vehicle v
    WHERE v.plate_number = p_plate_number
    AND ROWNUM = 1;
    

    INSERT INTO route (
                id_route,
                day_of,
                start_time,
                end_time,
                estimated_duration,
                available_space,
                id_vehicle_fk,
                id_payment_fk,
                end_point)
    VALUES (
                s_route.nextval,
                p_day,
                p_start_time,
                p_end_time,
                v_estimated_time,
                p_available_spaces,
                v_vehicle_id,
                s_payment_method.currval,
                p_end_point);
                

    INSERT INTO key_Location (
                id_key_location,
                location_name,
                road_name,
                relevant_location_1,
                relevant_location_2,
                id_route_fk)
    VALUES (
                s_key_location.nextval,
                p_location_name,
                p_road_name,
                p_relevant_location_1,
                p_relevant_location_2,
                s_route.currval);

    COMMIT;
    
    p_out_code := 0;
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK; 
        p_out_code := 1;
        RAISE; 
END insert_route_data;