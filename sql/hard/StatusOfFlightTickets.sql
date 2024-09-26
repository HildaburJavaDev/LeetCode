-- task №2793

SELECT 
    tab.passenger_id,
    CASE
        WHEN tab.row_number <= f.capacity THEN 'Confirmed'
        ELSE 'Waitlist'
    END AS status
FROM (
    SELECT 
    passenger_id,
    flight_id,
    ROW_NUMBER() OVER(PARTITION BY flight_id ORDER BY booking_time)
FROM passengers
) AS tab
JOIN flights f ON f.flight_id = tab.flight_id
ORDER BY tab.passenger_id

