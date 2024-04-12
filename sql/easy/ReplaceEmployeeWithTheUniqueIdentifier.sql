-- task № 1378

SELECT empUNI.unique_id, emp.name FROM employees emp
LEFT JOIN employeeUNI empUNI ON emp.id = empUNI.id