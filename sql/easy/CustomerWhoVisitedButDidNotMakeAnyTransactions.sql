-- task № 1581

SELECT tab.customer_id, COUNT(*)  AS count_no_trans FROM (
    SELECT v.customer_id, t.transaction_id
    FROM visits v
    LEFT JOIN transactions t ON v.visit_id = t.visit_id
    WHERE t.transaction_id IS NULL
) AS tab
GROUP BY tab.customer_id

