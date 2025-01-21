CREATE OR REPLACE TRIGGER ADM.beforeInsertPerson
BEFORE INSERT
ON ADM.person
FOR EACH ROW
BEGIN
    :new.created_by := USER;
    :new.creation_date := SYSDATE;
END beforeInsertPerson;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeUpdatePerson
BEFORE UPDATE
ON ADM.person
FOR EACH ROW
BEGIN
    :new.last_updated_by := USER;
    :new.update_date := SYSDATE;
END beforeUpdatePerson;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeInsertPersonal_id
BEFORE INSERT
ON ADM.personal_id
FOR EACH ROW
BEGIN
    :new.created_by := USER;
    :new.creation_date := SYSDATE;
END beforeInsertPersonal_id;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeUpdatePersonal_id
BEFORE UPDATE
ON ADM.personal_id
FOR EACH ROW
BEGIN
    :new.last_updated_by := USER;
    :new.update_date := SYSDATE;
END beforeUpdatePersonal_id;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeInsertGender
BEFORE INSERT
ON ADM.gender
FOR EACH ROW
BEGIN
    :new.created_by := USER;
    :new.creation_date := SYSDATE;
END beforeInsertGender;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeUpdateGender
BEFORE UPDATE
ON ADM.gender
FOR EACH ROW
BEGIN
    :new.last_updated_by := USER;
    :new.update_date := SYSDATE;
END beforeUpdateGender;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeInsertCenter
BEFORE INSERT
ON ADM.educational_center
FOR EACH ROW
BEGIN
    :new.created_by := USER;
    :new.creation_date := SYSDATE;
END beforeInsertCenter;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeUpdateCenter
BEFORE UPDATE
ON ADM.educational_center
FOR EACH ROW
BEGIN
    :new.last_updated_by := USER;
    :new.update_date := SYSDATE;
END beforeUpdateCenter;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeInsertApp
BEFORE INSERT
ON ADM.carpool_app
FOR EACH ROW
BEGIN
    :new.created_by := USER;
    :new.creation_date := SYSDATE;
END beforeInsertApp;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeUpdateApp
BEFORE UPDATE
ON ADM.carpool_app
FOR EACH ROW
BEGIN
    :new.last_updated_by := USER;
    :new.update_date := SYSDATE;
END beforeUpdateApp;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeInsertUpdatePassword
BEFORE INSERT OR UPDATE
ON ADM.person
FOR EACH ROW
DECLARE
    o_hash RAW(32);
BEGIN
    IF INSERTING THEN
        :NEW.password_salt := DBMS_RANDOM.STRING('P', FLOOR(DBMS_RANDOM.VALUE(40, 61)));
        o_hash := DBMS_CRYPTO.HASH(UTL_I18N.STRING_TO_RAW(:NEW.password_salt || RTRIM(:NEW.password_hash), 'AL32UTF8'), DBMS_CRYPTO.HASH_SH1);
        :NEW.password_hash := RAWTOHEX(o_hash);
    ELSIF UPDATING THEN
        IF :NEW.password_hash != :OLD.password_hash THEN
            :NEW.password_salt := DBMS_RANDOM.STRING('P', FLOOR(DBMS_RANDOM.VALUE(40, 61)));
            o_hash := DBMS_CRYPTO.HASH(UTL_I18N.STRING_TO_RAW(:NEW.password_salt || RTRIM(:NEW.password_hash), 'AL32UTF8'), DBMS_CRYPTO.HASH_SH1);
            :NEW.password_hash := RAWTOHEX(o_hash); 
        ELSE
            :NEW.password_salt := :OLD.password_salt;
        END IF;
    END IF;
END beforeInsertUpdatePassword;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeInsertDriver
BEFORE INSERT
ON ADM.driver
FOR EACH ROW
BEGIN
    :new.created_by := USER;
    :new.creation_date := SYSDATE;
END beforeInsertDriver;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeUpdateDriver
BEFORE UPDATE
ON ADM.driver
FOR EACH ROW
BEGIN
    :new.last_updated_by := USER;
    :new.update_date := SYSDATE;
END beforeUpdateDriver;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeInsertPassenger
BEFORE INSERT
ON ADM.passenger
FOR EACH ROW
BEGIN
    :new.created_by := USER;
    :new.creation_date := SYSDATE;
END beforeInsertPassenger;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeUpdatePassenger
BEFORE UPDATE
ON ADM.passenger
FOR EACH ROW
BEGIN
    :new.last_updated_by := USER;
    :new.update_date := SYSDATE;
END beforeUpdatePassenger;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeInsertAdmin
BEFORE INSERT
ON ADM.admin_info
FOR EACH ROW
BEGIN
    :new.created_by := USER;
    :new.creation_date := SYSDATE;
END beforeInsertAdmin;

--------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER ADM.beforeUpdateAdmin
BEFORE UPDATE
ON ADM.admin_info
FOR EACH ROW
BEGIN
    :new.last_updated_by := USER;
    :new.update_date := SYSDATE;
END beforeUpdateAdmin;