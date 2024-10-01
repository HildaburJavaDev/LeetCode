-- task №1511

SELECT tab.customer_id, tab.name FROM (
    SELECT 
        c.customer_id,
        c.name,
        SUM(p.price * o.quantity) AS cost FROM customers c
    JOIN orders o ON o.customer_id = c.customer_id
    JOIN product p ON p.product_id = o.product_id
    WHERE o.order_date BETWEEN '2020-06-01' AND '2020-07-31'
    GROUP BY c.customer_id, c.name, EXTRACT(MONTH FROM o.order_date)
) tab
WHERE tab.cost >= 100
GROUP BY tab.customer_id, tab.name
HAVING COUNT(*) = 2
