-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
insert ALL
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001)
into customers values (3007, 'Brad Davis', 'New York', 200, 5001)
into customers values (3005, 'Graham Zusi', 'California', 200, 5002)
into customers values (3008, 'Julian Green', 'London', 300, 5002)
into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006)
into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
into customers values (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;



--Write an SQL statement to know which salesman are working for which customer.

SELECT customer_name ,SALESMAN_NAME FROM CUSTOMERS CU
INNER JOIN SALESMAN S
ON CU.SALESMAN_ID=S.SALESMAN_ID;

--Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.

SELECT customer_name ,SALESMAN_NAME FROM CUSTOMERS CU
INNER JOIN SALESMAN S
ON CU.SALESMAN_ID=S.SALESMAN_ID;

--Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.


SELECT * FROM CUSTOMERS CU
INNER JOIN SALESMAN S
ON CU.SALESMAN_ID=S.SALESMAN_ID
WHERE CU.GRADE<300
ORDER BY CU.customer_name;


--Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.

SELECT customer_name FROM CUSTOMERS CU
INNER JOIN SALESMAN S
ON CU.SALESMAN_ID=S.SALESMAN_ID
WHERE COMMISSION>12
ORDER BY CU.customer_name;
