CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare os int;
    set os=N-1;
    RETURN 
    (
        select distinct salary from Employee order by Salary Desc limit 1 offset os
    );
    END