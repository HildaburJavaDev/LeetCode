-- task № 1934

SELECT 
    s.user_id,
    ROUND(
        CAST(COUNT(*) FILTER (WHERE c.action LIKE 'conf%') AS NUMERIC) / 
        CAST(COUNT(*) AS NUMERIC) , 2
    ) AS confirmation_rate
FROM signups s
LEFT JOIN confirmations c ON c.user_id = s.user_id
GROUP BY s.user_id