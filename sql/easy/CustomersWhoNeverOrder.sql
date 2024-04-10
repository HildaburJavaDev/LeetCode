-- task № 183

SELECT name AS "Customers" FROM customers
LEFT JOIN orders ON customers.id = orders.customerId
WHERE orders.id IS NULL 