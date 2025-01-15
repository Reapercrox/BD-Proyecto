CREATE OR REPLACE PROCEDURE insert_new_person(
    p_first_name NVARCHAR2,
    p_second_name NVARCHAR2,
    p_last_name NVARCHAR2,
    p_second_last_name NVARCHAR2,
    p_birthday DATE,
    p_institutional_email NVARCHAR2,
    p_password_hash NVARCHAR2,
    p_accepts_t_and_c NUMBER,
    p_id_gender_fk NUMBER,
    p_id_center_fk NUMBER,
    p_id_personal_fk NUMBER,
    p_id_app_fk NUMBER
) AS
    c_age NUMBER;
BEGIN

    SELECT FLOOR(MONTHS_BETWEEN(SYSDATE,p_birthday)/12) INTO c_age FROM dual;

    INSERT INTO person (
        id_person,
        first_name,
        second_name,
        last_name,
        second_last_name,
        birthday,
        age,
        accepts_t_and_c,
        institutional_email,
        password_hash,
        id_gender_fk,
        id_personal_fk,
        id_center_fk,
        id_app_fk)
    VALUES (
        s_person.NEXTVAL,
        p_first_name, 
        p_second_name, 
        p_last_name,
        p_second_last_name,
        p_birthday,
        c_age,
        p_accepts_t_and_c,
        p_institutional_email,
        p_password_hash,
        p_id_gender_fk,
        p_id_personal_fk,
        p_id_center_fk,
        p_id_app_fk
    );
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK; 
        RAISE;
END insert_new_person;
