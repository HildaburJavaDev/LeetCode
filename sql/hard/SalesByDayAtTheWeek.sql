-- task №1479

SELECT item_category as Category,
SUM(CASE WHEN trim(to_char(order_date,'Day'))='Monday' THEN quantity else 0 END) AS Monday,
SUM(CASE WHEN trim(to_char(order_date,'Day'))='Tuesday' THEN quantity else 0 END) AS Tuesday,
SUM(CASE WHEN trim(to_char(order_date,'Day'))='Wednesday' THEN quantity else 0 END) AS Wednesday,
SUM(CASE WHEN trim(to_char(order_date,'Day'))='Thursday' THEN quantity else 0 END) AS Thursday,
SUM(CASE WHEN trim(to_char(order_date,'Day'))='Friday' THEN quantity else 0 END) AS Friday,
SUM(CASE WHEN trim(to_char(order_date,'Day'))='Saturday' THEN quantity else 0 END) AS Saturday,
SUM(CASE WHEN trim(to_char(order_date,'Day'))='Sunday' THEN quantity else 0 END) AS Sunday
FROM orders o 
RIGHT JOIN items i on o.item_id=i.item_id
GROUP BY item_category
ORDER BY item_category
