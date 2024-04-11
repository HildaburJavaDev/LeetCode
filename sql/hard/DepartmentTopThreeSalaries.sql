-- task № 185

WITH emp_salaries_with_rank AS (
	SELECT 
		dep.name AS department, 
		emp.name AS employee,
		emp.salary,
		DENSE_RANK() OVER(PARTITION BY dep.name ORDER BY salary DESC) FROM employee emp
	JOIN department dep ON dep.id = emp.departmentId
	ORDER BY dep.name, emp.salary DESC
)

SELECT department, employee, salary
FROM emp_salaries_with_rank
WHERE dense_rank <= 3;