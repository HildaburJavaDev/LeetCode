table: `Employee`

| Column Name | Type |
|-------------|------|
| id          | int  |
| salary      | int  |

id is the primary key (column with unique values) for this table.
Each row of this table contains information about the salary of an employee.
 

Write a solution to find the second highest salary from the `Employee` table. If there is no second highest salary, `return null` (return None in Pandas).

```sql
SELECT (
    SELECT DISTINCT salary FROM employee
    ORDER BY 1 DESC
    LIMIT 1 OFFSET 1
) AS "SecondHighestSalary"
```