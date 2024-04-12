-- task № 1068

SELECT product_name, year, price
FROM sales
JOIN product ON sales.product_id = product.product_id