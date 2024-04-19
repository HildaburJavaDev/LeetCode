--  task № 1327

SELECT 
    p.product_name, 
    SUM(o.unit) AS unit 
FROM products p
JOIN orders o ON o.product_id = p.product_id
WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY p.product_name
HAVING SUM(o.unit) >= 100
