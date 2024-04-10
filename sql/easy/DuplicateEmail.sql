-- task № 182

SELECT DISTINCT email FROM person
GROUP BY email
HAVING COUNT(email) > 1;

SELECT DISTINCT p1.email FROM person p1, person p2
WHERE p1.id != p2.id AND p1.email = p2.email;