SELECT m.name AS name
FROM employee m
WHERE m.Id IN (
    SELECT managerId
    FROM employee
    WHERE managerId IS NOT NULL
    GROUP BY managerId
    HAVING COUNT(*) >= 5
);
