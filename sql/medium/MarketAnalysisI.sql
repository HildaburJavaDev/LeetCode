SELECT 
    u.user_id AS buyer_id, 
    u.join_date, 
    count(o.buyer_id) FILTER (WHERE o.order_date BETWEEN '2019-01-01' AND '2019-12-31') AS orders_in_2019
FROM users u
LEFT JOIN orders o ON u.user_id = o.buyer_id
GROUP BY u.user_id, u.join_date
ORDER BY u.user_id
