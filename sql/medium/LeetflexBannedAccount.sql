-- task №1747

SELECT DISTINCT a.account_id FROM LogInfo a
JOIN LogInfo b ON
    a.account_id = b.account_id AND a.ip_address <> b.ip_address
    AND (a.login <= b.login AND b.login<=a.logout)
