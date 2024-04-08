WITH trips_without_banned AS (
	SELECT * FROM trips 
	WHERE 
	client_id NOT IN (
		SELECT users_id FROM users WHERE banned = 'Yes'
	)  AND
	driver_id NOT IN (
		SELECT users_id FROM users WHERE banned = 'Yes')
)

SELECT 
	request_at::date as "Day",
	ROUND(
           CAST(COUNT(*) FILTER (WHERE status LIKE 'cancelled%') AS NUMERIC) 
           / 
           CAST(COUNT(*) AS NUMERIC), 
           2
       )::NUMERIC(10,2) AS "Cancellation Rate"
FROM trips_without_banned
WHERE request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY "Day"
ORDER BY "Day"
