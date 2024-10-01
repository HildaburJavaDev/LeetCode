-- task №1264

SELECT DISTINCT page_id AS recommended_page FROM friendship
JOIN likes ON (user1_id = user_id AND user2_id = 1) OR (user2_id = user_id AND user1_id = 1)
WHERE page_id NOT IN (SELECT page_id FROM likes WHERE user_id = 1)
