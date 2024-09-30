-- task№1225

WITH combine AS (SELECT
    'failed' AS status,
    fail_date AS start_date
FROM
    Failed
WHERE
    fail_date >= '2019-01-01' AND fail_date < '2020-01-01'
UNION
SELECT
    'succeeded' AS status,
    success_date AS start_date
FROM
    Succeeded
WHERE
    success_date >= '2019-01-01' AND success_date < '2020-01-01'
ORDER BY start_date ASC),
labelled AS (
    SELECT  
        status, 
        start_date, 
        SUM(t.stint) OVER(ORDER BY start_date) AS stint
    FROM 
        combine
    LEFT JOIN (SELECT start_date, (CASE WHEN status = LAG(status, 1) OVER (ORDER BY start_date) THEN 0 ELSE 1 END) AS stint
        FROM combine
    ) t USING (start_date)
    ORDER BY
        start_date ASC
)
SELECT 
    status AS period_state, 
    MIN(start_date) AS start_date, 
    MAX(start_date) AS end_date
FROM labelled
GROUP BY
    status, stint
ORDER BY
    start_date ASC
