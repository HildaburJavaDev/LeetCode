-- task № 1075

SELECT 
    p.project_id,
    AVG(emp.experience_years)::NUMERIC(10,2) AS average_years 
FROM employee emp
JOIN project p ON p.employee_id = emp.employee_id
GROUP BY p.project_id