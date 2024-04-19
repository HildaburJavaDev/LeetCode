-- task № 1517

SELECT * FROM Users
WHERE mail ~ '^[a-zA-Z]+[a-zA-Z0-9_\.-]*@leetcode\.com$'