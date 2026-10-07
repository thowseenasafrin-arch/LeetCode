SELECT email As Email FROM person
GROUP BY email
HAVING COUNT(*)>1;

