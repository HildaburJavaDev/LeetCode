-- task №569

WITH salaries_with_ranks AS (
    SELECT 
        id,
        company,
        ROW_NUMBER() OVER(PARTITION BY company ORDER BY SALARY) AS salary_rank,
        COUNT(*) OVER(PARTITION BY company) AS count,
        salary
    FROM employee
)

SELECT 
    id,
    company,
    salary
FROM salaries_with_ranks
WHERE (
    CASE
        WHEN count % 2 = 1 AND salary_rank = count / 2 + 1 THEN true
        WHEN count % 2 = 0 AND salary_rank = count / 2 THEN true
        WHEN count % 2 = 0 AND salary_rank = count / 2 + 1 THEN true
    END
)
ORDER BY company, salary
