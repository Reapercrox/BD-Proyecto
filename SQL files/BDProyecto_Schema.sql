CREATE USER ADM 
    IDENTIFIED BY ADM 
    DEFAULT TABLESPACE proj_data 
    QUOTA 10M ON proj_data 
    TEMPORARY TABLESPACE temp
    QUOTA 5M ON system ;
    --PROFILE app_user 
    --PASSWORD EXPIRE;
--------------------------------------------------
GRANT connect TO ADM;
--------------------------------------------------
GRANT create session to ADM;
--------------------------------------------------
GRANT create table to ADM;
--------------------------------------------------
grant create view to ADM;
--------------------------------------------------
grant CREATE ANY INDEX to ADM;
--------------------------------------------------
grant unlimited TABLESPACE TO ADM;



CREATE USER ADM_BIT 
    IDENTIFIED BY ADM_BIT 
    DEFAULT TABLESPACE PROJ_ADM_data 
    QUOTA 10M ON PROJ_ADM_data 
    TEMPORARY TABLESPACE temp
    QUOTA 5M ON system ;
    --PROFILE app_user 
    --PASSWORD EXPIRE;
--------------------------------------------------
GRANT connect TO ADM_BIT;
--------------------------------------------------
GRANT create session to ADM_BIT;
--------------------------------------------------
GRANT create table to ADM_BIT;
--------------------------------------------------
grant create view to ADM_BIT;
--------------------------------------------------
grant CREATE ANY INDEX to ADM_BIT;
--------------------------------------------------
grant unlimited TABLESPACE TO ADM_BIT;
--------------------------------------------------
GRANT CREATE TRIGGER TO ADM_BIT;
--------------------------------------------------
GRANT CREATE SEQUENCE TO ADM_BIT;
--------------------------------------------------
