--  task №1398

SELECT DISTINCT c.customer_id, c.customer_name FROM customers c
JOIN orders o1 ON o1.customer_id = c.customer_id
JOIN orders o2 ON o2.customer_id = c.customer_id
WHERE (
    o1.product_name = 'A' AND o2.product_name = 'B' AND c.customer_id NOT IN (
        SELECT customer_id FROM orders WHERE product_name = 'C'
        )
    )
