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