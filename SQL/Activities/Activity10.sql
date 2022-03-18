--Write a query to find all the orders issued against the salesman who may works for customer whose id is 3007.

SELECT * FROM ORDERS O
WHERE SALESMAN_ID IN (
SELECT SALESMAN_ID FROM CUSTOMERS
WHERE CUSTOMER_ID=3007);


--Write a query to find all orders attributed to a salesman in New York.

SELECT * FROM ORDERS O
WHERE SALESMAN_ID IN
(SELECT SALESMAN_ID FROM SALESMAN
WHERE SALESMAN_CITY='New York');


--Write a query to count the customers with grades above New York's average.

SELECT COUNT(*) FROM CUSTOMERS 
WHERE GRADE > (SELECT AVG(GRADE) FROM CUSTOMERS WHERE CITY='New York');


--Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM ORDERS  
WHERE SALESMAN_ID IN 
(SELECT SALESMAN_ID FROM SALESMAN 
WHERE COMMISSION=(SELECT MAX(COMMISSION)FROM SALESMAN));