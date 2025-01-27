CREATE OR REPLACE PROCEDURE ADM.available_routes(
    p_start NUMBER,
    p_end NUMBER,
    p_out_data OUT SYS_REFCURSOR
) AS
BEGIN
    OPEN p_out_data FOR
        SELECT day_of, start_time, end_time, estimated_duration, location_name, road_name, relevant_location_1, relevant_location_2, id_route, id_key_location
        FROM (
            SELECT
                day_of,
                start_time,
                end_time,
                estimated_duration,
                location_name,
                road_name,
                relevant_location_1,
                relevant_location_2,
                id_route,
                id_key_location,
                ROWNUM AS rn
            FROM route r
            INNER JOIN key_location k
            ON r.id_route = k.id_route_fk
            WHERE ROWNUM <= p_end AND SYSDATE < day_of AND r.available_space > 0
        )
        WHERE rn >= p_start;
END available_routes;