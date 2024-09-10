## 1407. Top Travellers

Table: `Users`

| Column Name   | Type    |
|---------------|---------|
| id            | int     |
| name          | varchar |

`id` is the column with unique values for this table.
`name` is the name of the user.
 

Table: `Rides`

| Column Name   | Type    |
|---------------|---------|
| id            | int     |
| user_id       | int     |
| distance      | int     |

`id` is the column with unique values for this table.
`user_id` is the id of the user who traveled the distance "distance".
 

Write a solution to report the distance traveled by each user.

Return the result table ordered by travelled_distance in descending order, if two or more users traveled the same distance, order them by their name in ascending order.

```sql
SELECT 
    u.name, 
    COALESCE(SUM(r.distance), 0) AS travelled_distance
FROM users u
LEFT JOIN rides r ON r.user_id = u.id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC, u.name ASC
```