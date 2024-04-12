-- task № 577

SELECT emp.name, b.bonus FROM employee emp
LEFT JOIN bonus b ON b.empid = emp.empid
WHERE b.bonus < 1000 OR b.bonus IS NULL