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