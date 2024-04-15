-- task № 1633

SELECT 
    reg.contest_id,
    (CAST(COUNT(reg.user_id) AS NUMERIC) / 
    CAST((SELECT COUNT(*) FROM users) AS NUMERIC) * 100)::NUMERIC(10,2) AS percentage
FROM register reg
LEFT JOIN users u ON u.user_id = reg.user_id
GROUP BY reg.contest_id
ORDER BY percentage DESC, contest_id;