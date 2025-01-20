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
    p_type_id NUMBER,
    p_personal_id NUMBER,
    p_id_app_fk NUMBER,
    p_country NVARCHAR2,
    p_province NVARCHAR2,
    p_municipality NVARCHAR2,
    p_district NVARCHAR2,
    p_address NVARCHAR2,
    p_zip_code NVARCHAR2,
    p_procedure_message OUT NVARCHAR2
) AS
    c_age NUMBER;
    e_district NVARCHAR2(50);
    e_email NVARCHAR2(100);
BEGIN

    SELECT FLOOR(MONTHS_BETWEEN(SYSDATE,p_birthday)/12) INTO c_age FROM dual;
    
    BEGIN
    
    SELECT institutional_email
    INTO e_email
    FROM person
    WHERE institutional_email = p_institutional_email;
    
    p_procedure_message := 'Email already registered';
    RETURN;
    
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
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
    
    END;
    
    BEGIN
        SELECT district_name
        INTO e_district
        FROM district
        WHERE district_name = UPPER(p_district);
        
        INSERT INTO address (
            id_address,
            exact_address,
            zip_code,
            id_district_fk,
            id_person_fk
        ) 
        VALUES(
            s_address.NEXTVAL,
            p_address,
            p_zip_code,
            (SELECT id_district FROM district WHERE district_name = UPPER(p_district)),
            s_person.CURRVAL
        );

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            INSERT INTO district (
                id_district,
                district_name,
                id_municipality_fk
            ) VALUES (
                s_district.NEXTVAL,
                UPPER(p_district),
                (SELECT id_municipality FROM municipality WHERE municipality_name = UPPER(p_municipality))
            );

            INSERT INTO address (
                id_address,
                exact_address,
                zip_code,
                id_district_fk,
                id_person_fk
            ) 
            VALUES(
                s_address.NEXTVAL,
                p_address,
                p_zip_code,
                (SELECT id_district FROM district WHERE district_name = UPPER(p_district)),
                s_person.currval
            );
    END;
    
    BEGIN
        INSERT INTO personal_id(
            id_personal,
            type_id,
            number_id,
            id_person_fk
        )
        VALUES(
            s_persona_id.nextval,
            p_type_id,
            p_personal_id,
            s_person.currval
        );
    END;
    
    COMMIT;
    
    p_message := 'SUCCESS';
        
    EXCEPTION
        WHEN OTHERS THEN
            ROLLBACK; 
            p_message := 'Error ocurred: ' || SQLERRM;
            RAISE;
END insert_new_person;
