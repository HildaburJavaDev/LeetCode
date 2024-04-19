-- task № 1667

SELECT 
    user_id, 
    CONCAT(
        UPPER(LEFT(name, 1)),
        LOWER(substring(name,2,length(name)))
     ) AS name FROM users
ORDER BY user_id