Table: Activity

| Column Name  | Type    |
|--------------|---------|
| player_id    | int     |
| device_id    | int     |
| event_date   | date    |
| games_played | int     |

(player_id, event_date) is the primary key (combination of columns with unique values) of this table.
This table shows the activity of players of some games.
Each row is a record of a player who logged in and played a number of games (possibly 0) before logging out on someday using some device.
 

Write a solution to report the fraction of players that logged in again on the day after the day they first logged in, rounded to 2 decimal places. In other words, you need to count the number of players that logged in for at least two consecutive days starting from their first login date, then divide that number by the total number of players.

```sql
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

```