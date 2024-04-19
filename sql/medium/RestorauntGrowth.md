Table: Customer

| Column Name   | Type    |
|---------------|---------|
| customer_id   | int     |
| name          | varchar |
| visited_on    | date    |
| amount        | int     |

In SQL,(customer_id, visited_on) is the primary key for this table.
This table contains data about customer transactions in a restaurant.
visited_on is the date on which the customer with ID (customer_id) has visited the restaurant.
amount is the total paid by a customer.
 

You are the restaurant owner and you want to analyze a possible expansion (there will be at least one customer every day).

Compute the moving average of how much the customer paid in a seven days window (i.e., current day + 6 days before). average_amount should be rounded to two decimal places.

Return the result table ordered by visited_on in ascending order.

```sql
WITH amount_per_day AS (
    SELECT 
        visited_on,
        SUM(amount) AS amount
    FROM customer
    GROUP BY visited_on
)
SELECT
    visited_on, 
    MAX(amount) AS amount, 
    average_amount 
FROM (
    SELECT 
        visited_on, 
        SUM(amount) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS amount,
        (SUM(amount) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) * 1.0 / 7)::NUMERIC(10,2) AS average_amount
    FROM amount_per_day
    GROUP BY visited_on, amount
) AS tab
WHERE visited_on >= (SELECT MIN(visited_on + 6) FROM amount_per_day)
GROUP BY 1, 3
ORDER BY 1
```