-- task № 1907

SELECT 
    category.category AS category,
    COALESCE(COUNT(accounts.income), 0) AS accounts_count
FROM 
    (SELECT 'Low Salary' AS category UNION SELECT 'Average Salary' UNION SELECT 'High Salary') AS category
LEFT JOIN 
    Accounts ON 
        CASE 
            WHEN category.category = 'Low Salary' AND income < 20000 THEN 1
            WHEN category.category = 'Average Salary' AND income >= 20000 AND income <= 50000 THEN 1
            WHEN category.category = 'High Salary' AND income > 50000 THEN 1
            ELSE 0
        END = 1
GROUP BY 
    category.category;
