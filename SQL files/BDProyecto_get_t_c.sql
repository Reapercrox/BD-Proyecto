CREATE OR REPLACE PROCEDURE ADM.get_t_c(
    p_text OUT NVARCHAR2
) AS
BEGIN
    SELECT t_and_c
    INTO p_text
    FROM carpool_app;
END get_t_c;
    