-- task № 184

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