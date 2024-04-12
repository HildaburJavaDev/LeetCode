Table: Employee

| Column Name | Type    |
|-------------|---------|
| id          | int     |
| name        | varchar |
| department  | varchar |
| managerId   | int     |

id is the primary key (column with unique values) for this table.
Each row of this table indicates the name of an employee, their department, and the id of their manager.
If managerId is null, then the employee does not have a manager.
No employee will be the manager of themself.
 

Write a solution to find managers with at least five direct reports.

Return the result table in any order.

```sql
SELECT name FROM (
    SELECT e1.id, e1.name FROM employee e1
    LEFT JOIN employee e2 ON e1.id = e2.managerid
    GROUP BY e1.id, e1.name
    HAVING COUNT(e2.managerid) >= 5
) AS tab
```