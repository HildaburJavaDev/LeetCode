Table: Sales

| Column Name | Type  |
|-------------|-------|
| sale_id     | int   |
| product_id  | int   |
| year        | int   |
| quantity    | int   |
| price       | int   |

(sale_id, year) is the primary key (combination of columns with unique values) of this table.
product_id is a foreign key (reference column) to Product table.
Each row of this table shows a sale on the product product_id in a certain year.
Note that the price is per unit.
 

Table: Product

| Column Name  | Type    |
|--------------|---------|
| product_id   | int     |
| product_name | varchar |

product_id is the primary key (column with unique values) of this table.
Each row of this table indicates the product name of each product.
 

Write a solution to select the product id, year, quantity, and price for the first year of every product sold.

Return the resulting table in any order.


```sql
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
```