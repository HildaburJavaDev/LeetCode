SELECT (
    SELECT DISTINCT salary FROM employee
    ORDER BY 1 DESC
    LIMIT 1 OFFSET 1
) AS "SecondHighestSalary"