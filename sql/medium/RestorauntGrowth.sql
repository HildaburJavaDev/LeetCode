-- task № 1321

WITH amount_per_day AS (
    SELECT 
        visited_on,
        SUM(amount) AS amount
    FROM customer
    GROUP BY visited_on
)
SELECT
    visited_on, 
    MAX(amount) AS amount, 
    average_amount 
FROM (
    SELECT 
        visited_on, 
        SUM(amount) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS amount,
        (SUM(amount) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) * 1.0 / 7)::NUMERIC(10,2) AS average_amount
    FROM amount_per_day
    GROUP BY visited_on, amount
) AS tab
WHERE visited_on >= (SELECT MIN(visited_on + 6) FROM amount_per_day)
GROUP BY 1, 3
ORDER BY 1