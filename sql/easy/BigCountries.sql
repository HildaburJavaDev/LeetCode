-- task № 595

SELECT name, population, area
FROM world
WHERE area >= 3 * POWER(10, 6) OR population >= 25 * POWER(10, 6)