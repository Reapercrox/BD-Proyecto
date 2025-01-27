CREATE OR REPLACE PROCEDURE ADM.get_routes_count(
    
    p_out_quantity OUT NUMBER
    
)AS
    v_count NUMBER;
    
BEGIN

    p_out_quantity := 0;

    
    BEGIN
        SELECT COUNT(*)
        INTO v_count
        FROM route
        WHERE SYSDATE < day_of AND available_space > 0;
        
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                DBMS_OUTPUT.PUT_LINE('Vehicle Count: ' || v_count);
    END;
    
    p_out_quantity := v_count;

    
END get_routes_count;