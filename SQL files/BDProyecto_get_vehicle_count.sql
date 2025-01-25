CREATE OR REPLACE PROCEDURE ADM.get_vehicle_count(
    
    p_out_quantity OUT NUMBER
    
)AS

    v_driver_id NUMBER;
    v_person_id NUMBER;
    v_count NUMBER;
    
BEGIN

    p_out_quantity := 0;
    BEGIN
        SELECT id_person_fk
        INTO v_person_id
        FROM user_session
        WHERE active_session = 1
        AND ROWNUM = 1;
        
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                DBMS_OUTPUT.PUT_LINE('Person: ' || v_person_id);
                RETURN;
    END;
    
    BEGIN
        SELECT id_driver
        INTO v_driver_id
        FROM driver
        WHERE id_person_fk = v_person_id
        AND ROWNUM = 1;
        
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                DBMS_OUTPUT.PUT_LINE('Driver: ' || v_driver_id);
                RETURN;
    END;
    
    BEGIN
        SELECT COUNT(*)
        INTO v_count
        FROM vehicle v
        WHERE v.id_driver_fk = v_driver_id;
        
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                DBMS_OUTPUT.PUT_LINE('Vehicle Count: ' || v_count);
    END;
    
    p_out_quantity := v_count;

    
END get_vehicle_count;