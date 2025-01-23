BEGIN
    DBMS_SCHEDULER.create_job (
        job_name        => 'check_inactive_sessions_job',
        job_type        => 'PLSQL_BLOCK',
        job_action      => 'BEGIN check_inactive_sessions; END;',
        start_date      => SYSTIMESTAMP,  -- Start immediately
        repeat_interval => 'FREQ=MINUTELY; INTERVAL=31',  -- Repeat every 31 minutes
        enabled         => TRUE  -- Enable the job
    );
END;


BEGIN
    DBMS_SCHEDULER.DISABLE('check_inactive_sessions_job');
END;