-- task № 1341

WITH user_results AS (
    SELECT u.name AS results, COUNT(mr.*) AS count 
    FROM users u
    JOIN MovieRating mr ON mr.user_id = u.user_id
    GROUP BY u.name
),
movie_titles AS (
    SELECT m.title AS title, AVG(mr.rating) AS rating 
    FROM movies m
    JOIN  MovieRating mr ON mr.movie_id = m.movie_id
    WHERE mr.created_at between '2020-02-01' and '2020-02-29'
    GROUP BY m.title
)

SELECT MIN(results) AS results
FROM user_results
WHERE count = (SELECT MAX(count) FROM user_results)  
UNION ALL
SELECT MIN(title) AS min_movie
FROM movie_titles
WHERE rating = (SELECT MAX(rating) FROM movie_titles)
