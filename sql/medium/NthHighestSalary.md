Table: Employee

| Column Name | Type |
|-------------|------|
| id          | int  |
| salary      | int  |

id is the primary key (column with unique values) for this table.
Each row of this table contains information about the salary of an employee.
 

Write a solution to find the nth highest salary from the Employee table. If there is no nth highest salary, return null.

The result format is in the following example.

 

Example 1:

Input: 
Employee table:
| id | salary |
|----|--------|
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |

n = 2
Output:
| getNthHighestSalary(2) |
|------------------------|
| 200                    |

Example 2:

Input: 
Employee table:

| id | salary |
|----|--------|
| 1  | 100    |

n = 2
Output: 

| getNthHighestSalary(2) |
|------------------------|
| null                   |

```sql 
	CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
	BEGIN
	RETURN QUERY (
		SELECT DISTINCT tab.salary AS getNthHighestSalary FROM (
			SELECT 
			Employee.salary, 
			dense_rank() over (order by Employee.salary DESC) as rank FROM Employee
			) as tab
			WHERE rank = N
	);
	END;
	$$ LANGUAGE plpgsql;
```