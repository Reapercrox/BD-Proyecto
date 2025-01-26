CREATE OR REPLACE PROCEDURE ADM.select_vehicle(
    p_plate IN NVARCHAR2,
    p_out_id OUT NUMBER
) AS

BEGIN
    
    SELECT id_vehicle
    INTO p_out_id
    FROM vehicle
    WHERE plate_number = p_plate
    AND ROWNUM = 1;
    
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            p_out_id := 0;
            RETURN;
    
END select_vehicle;