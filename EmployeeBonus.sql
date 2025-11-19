select name, bonus from Employee 
LEFT JOIN Bonus USING(empId)  
where bonus<1000 or bonus IS null
