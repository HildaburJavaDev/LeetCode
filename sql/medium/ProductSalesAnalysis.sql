-- task № 1070

WITH first_year_sales AS (
    SELECT product_id, MIN(year) AS first_year
    FROM sales
    GROUP BY product_id
)

SELECT 
    first_year_sales.*,
    sales.quantity,
    sales.price 
FROM first_year_sales
JOIN sales ON 
    first_year_sales.product_id = sales.product_id AND 
    first_year_sales.first_year = sales.year