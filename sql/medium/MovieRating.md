Table: Movies

| Column Name   | Type    |
|---------------|---------|
| movie_id      | int     |
| title         | varchar |

movie_id is the primary key (column with unique values) for this table.
title is the name of the movie.
 

Table: Users

| Column Name   | Type    |
|---------------|---------|
| user_id       | int     |
| name          | varchar |

user_id is the primary key (column with unique values) for this table.
 

Table: MovieRating

| Column Name   | Type    |
|---------------|---------|
| movie_id      | int     |
| user_id       | int     |
| rating        | int     |
| created_at    | date    |

(movie_id, user_id) is the primary key (column with unique values) for this table.
This table contains the rating of a movie by a user in their review.
created_at is the user's review date. 
 

Write a solution to:

Find the name of the user who has rated the greatest number of movies. In case of a tie, return the lexicographically smaller user name.
Find the movie name with the highest average rating in February 2020. In case of a tie, return the lexicographically smaller movie name.

```sql
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

```