SELECT
    transaction_date, 
    COALESCE(SUM(amount) FILTER (WHERE amount % 2 != 0), 0) AS odd_sum,
    COALESCE(SUM(amount) FILTER (WHERE amount % 2 = 0), 0) AS even_sum
FROM transactions
GROUP BY transaction_date
ORDER BY transaction_date
