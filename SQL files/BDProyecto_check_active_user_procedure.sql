CREATE OR REPLACE PROCEDURE check_inactive_sessions AS
BEGIN
    UPDATE user_session
    SET active_session = 0
    WHERE expiration_time < SYSTIMESTAMP; 
    COMMIT;  
END;