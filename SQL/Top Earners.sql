SELECT salary*months as earnings, COUNT(employee_id) FROM Employee GROUP BY earnings ORDER BY earnings DESC LIMIT 1;
