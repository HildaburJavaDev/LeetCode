-- task № 1204

SELECT person_name FROM (
    SELECT
        turn,
        person_name,
        SUM(weight) OVER (ORDER BY turn ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) AS previous_sum
    FROM queue
) AS tab
WHERE tab.previous_sum <= 1000
ORDER BY tab.turn DESC
LIMIT 1