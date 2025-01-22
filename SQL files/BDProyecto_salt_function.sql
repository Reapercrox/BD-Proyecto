create or replace FUNCTION generate_salt(p_length IN NUMBER) RETURN NVARCHAR2 IS
    v_salt NVARCHAR2(61);
    v_characters VARCHAR2(100) := 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?'; -- Define allowed characters
BEGIN
    v_salt := '';
    FOR i IN 1..p_length LOOP
        v_salt := v_salt || SUBSTR(v_characters, TRUNC(DBMS_RANDOM.VALUE(1, LENGTH(v_characters) + 1)), 1);
    END LOOP;
    RETURN v_salt;
END generate_salt;