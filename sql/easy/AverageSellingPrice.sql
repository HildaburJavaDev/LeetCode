-- task № 1251

SELECT 
    product_id, 
    COALESCE(ROUND(AVG(average_price), 2), 0) AS average_price 
FROM (
    SELECT 
        p.product_id, 
        (CAST(SUM(p.price * us.units) AS NUMERIC) / 
        CAST(SUM(us.units) AS NUMERIC)) AS average_price 
        FROM prices p
        LEFT JOIN unitssold us ON 
        p.product_id = us.product_id AND
        us.purchase_date BETWEEN p.start_date AND p.end_date
        GROUP BY p.product_id
) AS tab
GROUP BY product_id