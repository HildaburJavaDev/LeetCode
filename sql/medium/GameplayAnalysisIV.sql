WITH cte AS 
(   
    SELECT player_id FROM
    (SELECT player_id, event_date, 
    lead(event_date) OVER(PARTITION BY player_id ORDER BY event_date) AS lead_date, 
    rank() OVER(PARTITION BY player_id ORDER BY event_date) AS rnk 
    FROM Activity) t1
    WHERE rnk=1 AND lead_date-event_date=1
)

SELECT round(count(player_id)/(SELECT count(distinct player_id) FROM Activity)::NUMERIC,2) AS fraction FROM cte
