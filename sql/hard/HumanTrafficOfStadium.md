# Task №601

Table: `Stadium`

| Column Name   | Type    |
|---------------|---------|
| id            | int     |
| visit_date    | date    |
| people        | int     |

`visit_date` is the column with unique values for this table.
Each row of this table contains the visit date and visit id to the stadium with the number of people during the visit.
As the id increases, the date increases as well.
 
Write a solution to display the records with three or more rows with consecutive id's, and the number of people is greater than or equal to 100 for each.

Return the result table ordered by visit_date in ascending order.

```sql
WITH cte AS (
    SELECT id, visit_date, people FROM stadium WHERE people>=100
)
SELECT id, visit_date, people FROM cte
WHERE (id-1 IN (SELECT id FROM cte) AND id-2 IN (SELECT id FROM cte)) 
OR (id+1 IN (SELECT id FROM cte) AND id+2 IN (SELECT id FROM cte)) 
OR (id+1 IN (SELECT id FROM cte) AND id-1 IN (SELECT id FROM cte)) 
```
