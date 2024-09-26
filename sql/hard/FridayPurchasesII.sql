-- task №2994

WITH cte AS (
    SELECT generate_series('2023-11-03'::DATE, '2023-11-24'::DATE, '7 day')::DATE
)

SELECT 
    ROW_NUMBER() OVER(ORDER BY generate_series) AS week_of_month,
    generate_series AS purchase_date,
    COALESCE(SUM(p.amount_spend), 0) AS total_amount
FROM cte
LEFT JOIN purchases p ON p.purchase_date = cte.generate_series
GROUP BY 2
ORDER BY 1
