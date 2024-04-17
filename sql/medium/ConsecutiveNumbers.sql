-- task № 180

SELECT DISTINCT l1.num AS consecutivenums
FROM logs l1, logs l2, logs l3
WHERE l1.id = l2.id - 1 AND l2.id = l3.id - 1
AND l1.num = l2.num AND l3.num = l2.num