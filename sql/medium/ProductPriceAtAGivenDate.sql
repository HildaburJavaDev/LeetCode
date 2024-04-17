-- task № 1164

WITH products_with_new_price AS (
        SELECT product_id, new_price FROM (
        SELECT 
            product_id,
            new_price,
            ROW_NUMBER() OVER (PARTITION BY product_id ORDER BY change_date DESC) AS rn
        FROM products
        WHERE change_date <= '2019-08-16'
    ) AS tab
    WHERE rn = 1
), all_products AS (
    SELECT DISTINCT product_id FROM products
)

SELECT 
    ap.product_id,
    CASE
        WHEN pw.new_price IS NULL THEN 10
        ELSE pw.new_price
    END AS price
FROM all_products ap
LEFT JOIN products_with_new_price pw ON pw.product_id = ap.product_id