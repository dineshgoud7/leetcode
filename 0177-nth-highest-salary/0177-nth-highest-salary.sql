CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare c int;
    select count(distinct salary) into c from employee;
      if(c<N) then
        return null;
      end if;
      set N=N-1;
  RETURN (
      # Write your MySQL query statement below.
        select distinct salary from employee 
        order by salary desc
        limit 1 offset N
  );
END;