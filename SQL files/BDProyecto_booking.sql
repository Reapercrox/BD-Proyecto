CREATE OR REPLACE PROCEDURE ADM.insert_booking(
    p_id_route IN NUMBER,
    p_id_key IN NUMBER,
    p_comment IN NVARCHAR2,
    p_out_code OUT NUMBER
) AS 
    v_day_of DATE;
    v_start_time TIMESTAMP;
    v_end_time TIMESTAMP;
    v_estimated_duration INTERVAL DAY TO SECOND;
    v_id_passenger NUMBER;
BEGIN

    SELECT 
        day_of,
        start_time,
        end_time,
        estimated_duration
    INTO 
        v_day_of, v_start_time, v_end_time, v_estimated_duration
    FROM 
        route 
    WHERE 
        id_route = p_id_route AND ROWNUM = 1;
        
    UPDATE route
    SET available_space = GREATEST(available_space - 1, 0)
    WHERE id_route = p_id_route;

    SELECT 
        id_passenger 
    INTO 
        v_id_passenger
    FROM 
        passenger ps 
    INNER JOIN 
        person p ON ps.id_person_fk = p.id_person 
    INNER JOIN 
        user_session u ON u.id_person_fk = p.id_person
    WHERE 
        u.active_session = 1 AND ROWNUM = 1;

    INSERT INTO booking(
        id_booking,
        boooking_date,
        start_time,
        end_time,
        total_estimated_time,
        booking_comment,
        id_passenger_fk,
        id_route_fk,
        id_pickup_point_fk
    ) VALUES (
        s_booking.nextval,
        v_day_of,
        v_start_time,
        v_end_time,
        v_estimated_duration,
        p_comment,
        v_id_passenger,
        p_id_route,
        p_id_key
    );
    
    p_out_code := 0;
    
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
        p_out_code := 1;
    WHEN OTHERS THEN
        p_out_code := 2;
        RAISE; 
END insert_booking;
        
