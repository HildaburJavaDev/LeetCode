-- task 1978 

SELECT employee_id FROM employees
WHERE salary < 30000 AND 
    manager_id NOT IN (SELECT employee_id FROM employees) AND 
    manager_id IS NOT NULL
ORDER BY 1