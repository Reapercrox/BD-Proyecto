CREATE OR REPLACE PROCEDURE ADM.log_out
AS
BEGIN
    UPDATE user_session
    SET active_session = 0
    WHERE active_session = 1;
END log_out;