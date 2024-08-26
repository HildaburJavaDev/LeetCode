WITH cte AS (
    SELECT id, visit_date, people FROM stadium WHERE people>=100
)
SELECT id, visit_date, people FROM cte
WHERE (id-1 IN (SELECT id FROM cte) AND id-2 IN (SELECT id FROM cte)) 
OR (id+1 IN (SELECT id FROM cte) AND id+2 IN (SELECT id FROM cte)) 
OR (id+1 IN (SELECT id FROM cte) AND id-1 IN (SELECT id FROM cte)) 
