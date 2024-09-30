-- task №1501

WITH cte AS (
    SELECT AVG(duration) FROM calls
)

SELECT DISTINCT c.name AS country FROM person p
JOIN country c ON substring(p.phone_number, 0, 4) = c.country_code
JOIN calls cl ON cl.callee_id = p.id OR p.id = cl.caller_id
GROUP BY c.name
HAVING AVG(cl.duration) > (SELECT * FROM cte)
