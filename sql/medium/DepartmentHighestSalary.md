Table: Employee

| Column Name  | Type    |
|--------------|---------|
| id           | int     |
| name         | varchar |
| salary       | int     |
| departmentId | int     |

id is the primary key (column with unique values) for this table.
departmentId is a foreign key (reference columns) of the ID from the Department table.
Each row of this table indicates the ID, name, and salary of an employee. It also contains the ID of their department.
 

Table: Department

| Column Name | Type    |
|-------------|---------|
| id          | int     |
| name        | varchar |

id is the primary key (column with unique values) for this table. It is guaranteed that department name is not NULL.
Each row of this table indicates the ID of a department and its name.
 

Write a solution to find employees who have the highest salary in each of the departments.

Return the result table in any order.

```sql
WITH dep_max_salary AS (
    SELECT d.id, d.name AS department, MAX(emp.salary) AS salary FROM department d
    JOIN employee emp ON emp.departmentId = d.id
    GROUP BY d.name, d.id
)

SELECT 
    dms.department, 
    emp.name AS employee,
    dms.salary 
FROM dep_max_salary dms
JOIN employee emp ON emp.salary = dms.salary AND dms.id = emp.departmentId
```