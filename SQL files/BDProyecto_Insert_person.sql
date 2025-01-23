CREATE OR REPLACE PROCEDURE insert_new_person(
    p_first_name NVARCHAR2,
    p_second_name NVARCHAR2,
    p_last_name NVARCHAR2,
    p_second_last_name NVARCHAR2,
    p_birthday NVARCHAR2,
    p_institutional_email NVARCHAR2,
    p_password_hash NVARCHAR2,
    p_accepts_t_and_c NUMBER,
    p_id_gender_fk NUMBER,
    p_id_center_fk NUMBER,
    p_type_id NUMBER,
    p_personal_id NVARCHAR2,
    p_id_app_fk NUMBER,
    p_country NVARCHAR2,
    p_province NVARCHAR2,
    p_municipality NVARCHAR2,
    p_district NVARCHAR2,
    p_address NVARCHAR2,
    p_zip_code NVARCHAR2,
    p_type_user NUMBER,
    p_license_number NVARCHAR2,
    p_expiration_date NVARCHAR2,
    p_procedure_message OUT NVARCHAR2
) AS
    c_age NUMBER;
    e_district NVARCHAR2(50);
    e_email NVARCHAR2(100);
BEGIN

    SELECT FLOOR(MONTHS_BETWEEN(SYSDATE,TO_DATE(p_birthday, 'DD-MON-RR'))/12) INTO c_age FROM dual;
    
    BEGIN
    
    SELECT institutional_email
    INTO e_email
    FROM person
    WHERE institutional_email = p_institutional_email;
    
    p_procedure_message := 2;
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
                id_center_fk,
                id_app_fk)
            VALUES (
                s_person.NEXTVAL,
                p_first_name, 
                p_second_name, 
                p_last_name,
                p_second_last_name,
                TO_DATE(p_birthday, 'DD-MON-RR'),
                c_age,
                p_accepts_t_and_c,
                p_institutional_email,
                p_password_hash,
                (SELECT id_gender FROM gender WHERE id_gender = p_id_gender_fk),
                (SELECT id_center FROM educational_center WHERE id_center = p_id_center_fk),
                (SELECT id_app FROM carpool_app WHERE id_app = p_id_app_fk)
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
    
    
    IF p_type_user = 0 THEN
        BEGIN
            INSERT INTO driver(
                id_driver,
                license_number,
                expiration_date,
                id_person_fk
            )
            VALUES(
                s_driver.nextval,
                p_license_number,
                p_expiration_date,
                s_person.currval
            );
        END;
    ELSIF p_type_user = 1 THEN
        BEGIN
            INSERT INTO passenger(
                id_passenger,
                id_person_fk
            )
            VALUES(
                s_passenger.nextval,
                s_person.currval
            );
        END;
    ELSIF p_type_user = 2 THEN
        BEGIN
            INSERT INTO admin_info(
                id_admin,
                admin_name,
                id_person_fk
            )
            VALUES(
                s_admin.nextval,
                p_first_name || ' ' || p_last_name,
                s_person.currval
            );
        END;
    END IF;
        
    
    COMMIT;
    
    p_procedure_message := 0;
        
    EXCEPTION
        WHEN OTHERS THEN
            ROLLBACK; 
            p_procedure_message := 1;
            RAISE;
END insert_new_person;
