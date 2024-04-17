Table: Products

| Column Name   | Type    |
|---------------|---------|
| product_id    | int     |
| new_price     | int     |
| change_date   | date    |

(product_id, change_date) is the primary key (combination of columns with unique values) of this table.
Each row of this table indicates that the price of some product was changed to a new price at some date.
 

Write a solution to find the prices of all products on 2019-08-16. Assume the price of all products before any change is 10.

Return the result table in any order.

```sql
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
```

