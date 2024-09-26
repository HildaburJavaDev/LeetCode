-- task №1767

WITH tasks_with_subtasks AS (
    select task_id, generate_series(1, subtasks_count) as gs FROM tasks
)

select 
    t.task_id AS task_id, 
    t.gs AS subtask_id 
FROM tasks_with_subtasks t
LEFT JOIN executed ex ON ex.task_id = t.task_id AND t.gs = ex.subtask_id
WHERE ex.subtask_id IS NULL
