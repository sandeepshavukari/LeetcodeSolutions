# Write your MySQL query statement below
SELECT id 
FROM (
    SELECT 
        id,
        temperature,
        recordDate,
        LAG(recordDate) OVER (ORDER BY recordDate ASC) AS prevrd,
        LAG(temperature) OVER (ORDER BY recordDate ASC) AS prevtemp
    FROM Weather
) a
WHERE temperature > prevtemp 
  AND DATEDIFF(recordDate, prevrd) = 1;
