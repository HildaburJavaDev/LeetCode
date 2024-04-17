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