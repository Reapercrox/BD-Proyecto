CREATE OR REPLACE PROCEDURE ADM.check_login (
    p_email IN NVARCHAR2,
    p_password IN NVARCHAR2,
    p_user_type OUT NUMBER,
    p_error_code OUT NUMBER
) AS
    v_password_hash RAW(32);
    v_stored_salt NVARCHAR2(61);
    v_stored_hash NVARCHAR2(64);
    v_user_id NUMBER;
    v_user_type NUMBER;
    v_user_found BOOLEAN := FALSE;
BEGIN
    p_user_type := NULL;
    p_error_code := 0;
    
    BEGIN
        SELECT password_salt, password_hash, id_person
        INTO v_stored_salt, v_stored_hash, v_user_id
        FROM ADM.person
        WHERE institutional_email = p_email;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            p_error_code := 2; -- User does not exist
            RETURN; -- Exit the procedure
    END;
    
    v_password_hash := DBMS_CRYPTO.HASH(
        UTL_I18N.STRING_TO_RAW(v_stored_salt || RTRIM(p_password), 'AL32UTF8'),
        DBMS_CRYPTO.HASH_SH1
    );
    
    IF RAWTOHEX(v_password_hash) = v_stored_hash THEN
        -- Check user type
        BEGIN
            SELECT 0 INTO p_user_type FROM ADM.driver WHERE id_person_fk = v_user_id;
            p_error_code := 0; -- Success, user is a driver
            RETURN; -- Exit the procedure
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                NULL; -- Not a driver
        END;

        BEGIN
            SELECT 1 INTO p_user_type FROM ADM.passenger WHERE id_person_fk = v_user_id;
            p_error_code := 0; -- Success, user is a passenger
            RETURN; -- Exit the procedure
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                NULL; -- Not a passenger
        END;

        BEGIN
            SELECT 2 INTO p_user_type FROM ADM.admin_info WHERE id_person_fk = v_user_id;
            p_error_code := 0; -- Success, user is an admin
            RETURN; -- Exit the procedure
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                NULL; -- Not an admin
        END;

    ELSE
        p_error_code := 1;
    END IF;
    
    
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            p_error_code := 2;
        WHEN OTHERS THEN
            p_error_code := 3;
END check_login;