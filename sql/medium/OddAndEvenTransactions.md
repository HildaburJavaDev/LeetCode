## 3220. Odd and even transactions

Table: `transactions`

| Column Name      | Type | 
|------------------|------|
| transaction_id   | int  |
| amount           | int  |
| transaction_date | date |

The transactions_id column uniquely identifies each row in this table.
Each row of this table contains the transaction id, amount and transaction date.
Write a solution to find the sum of amounts for odd and even transactions for each day. If there are no odd or even transactions for a specific date, display as 0.

Return the result table ordered by transaction_date in ascending order.
