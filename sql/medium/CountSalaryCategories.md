Table: Accounts

| Column Name | Type |
|-------------|------|
| account_id  | int  |
| income      | int  |

account_id is the primary key (column with unique values) for this table.
Each row contains information about the monthly income for one bank account.
 

Write a solution to calculate the number of bank accounts for each salary category. The salary categories are:

"Low Salary": All the salaries strictly less than $20000.
"Average Salary": All the salaries in the inclusive range [$20000, $50000].
"High Salary": All the salaries strictly greater than $50000.
The result table must contain all three categories. If there are no accounts in a category, return 0.

Return the result table in any order.


```sql
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

```