Table: Delivery

| Column Name                 | Type    |
+-----------------------------+---------+
| delivery_id                 | int     |
| customer_id                 | int     |
| order_date                  | date    |
| customer_pref_delivery_date | date    |

delivery_id is the column of unique values of this table.
The table holds information about food delivery to customers that make orders at some date and specify a preferred delivery date (on the same order date or after it).
 

If the customer's preferred delivery date is the same as the order date, then the order is called immediate; otherwise, it is called scheduled.

The first order of a customer is the order with the earliest order date that the customer made. It is guaranteed that a customer has precisely one first order.

Write a solution to find the percentage of immediate orders in the first orders of all customers, rounded to 2 decimal places.

```sql
WITH cte AS (
	SELECT customer_id, MIN(order_date) AS dt
	FROM delivery
	GROUP BY customer_id
)

SELECT
	ROUND(AVG(CASE WHEN cte.dt = customer_pref_delivery_date THEN 1 ELSE 0 END) * 100, 2) AS immediate_percentage
FROM cte
JOIN delivery
	ON delivery.customer_id = cte.customer_id
WHERE cte.dt = delivery.order_date
```