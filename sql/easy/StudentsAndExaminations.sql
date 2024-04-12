-- task № 1280

WITH students_exam_list AS (
	SELECT * FROM students s
	CROSS JOIN subjects
	ORDER BY 1
)

SELECT
	sel.student_id,
	sel.student_name,
	sel.subject_name,
	COUNT(ex.subject_name) AS attended_exams
FROM students_exam_list sel
LEFT JOIN examinations ex ON ex.student_id = sel.student_id AND sel.subject_name = ex.subject_name
GROUP BY sel.student_id, sel.student_name, sel.subject_name
ORDER BY sel.student_id, sel.subject_name