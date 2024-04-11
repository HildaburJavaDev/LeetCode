-- task № 197

SELECT id FROM (
	SELECT 
		id,
		temperature - LAG(temperature) OVER (order by recordDate) AS difference,
		recordDate - LAG(recordDate) OVER (order by recordDate) AS day_dif
	FROM weather
) AS tab
WHERE tab.difference > 0 AND day_dif = 1