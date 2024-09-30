-- task №1112

SELECT 
    distinct 
    student_id, 
    first_value(course_id) OVER (PARTITION BY student_id ORDER BY grade DESC, course_id) AS course_id,
    first_value(grade) OVER (PARTITION BY student_id ORDER BY grade DESC) AS grade
FROM Enrollments a
ORDER BY 1
