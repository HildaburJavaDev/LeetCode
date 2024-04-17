-- task № 1141

SELECT 
    activity_date AS day,
    COUNT(DISTINCT user_id) AS active_users
FROM activity
WHERE activity_date BETWEEN '2019-07-27'::date - 29 AND '2019-07-27'::date
GROUP BY activity_date