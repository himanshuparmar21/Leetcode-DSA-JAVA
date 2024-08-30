SELECT [name] AS Employee FROM Employee e1
where salary > (select salary from Employee where id=e1.managerId)