-- task № 570

SELECT name FROM (
    SELECT e1.id, e1.name FROM employee e1
    LEFT JOIN employee e2 ON e1.id = e2.managerid
    GROUP BY e1.id, e1.name
    HAVING COUNT(e2.managerid) >= 5
) AS tab