-- task № 626

(
    SELECT s1.id, s2.student FROM seat s1
    LEFT JOIN seat s2 ON s1.id + 1 = s2.id
    WHERE s1.id % 2 = 1 AND s2.student IS NOT NULL
)
UNION
(
    SELECT s1.id, s2.student FROM seat s1
    LEFT JOIN seat s2 ON s1.id - 1 = s2.id
    WHERE s1.id % 2 = 0
)
UNION
(
    SELECT id, student
    FROM (
        SELECT id, student, ROW_NUMBER() OVER (ORDER BY id DESC) AS row_num
        FROM seat
    ) AS sub
    WHERE row_num = 1 AND id % 2 = 1
) 
ORDER BY 1