-- task №1412

WITH exam_max_min AS (
    SELECT exam_id, MAX(score), MIN(score) FROM exam
    GROUP BY exam_id
), cte AS (
    SELECT ex.student_id FROM exam ex
    JOIN exam_max_min emm ON emm.exam_id = ex.exam_id AND (emm.max = ex.score OR emm.min = ex.score)
)

SELECT DISTINCT s.student_id, s.student_name FROM student s
JOIN exam ex ON ex.student_id = s.student_id
WHERE s.student_id NOT IN (SELECT student_id FROM cte)
ORDER BY s.student_id
