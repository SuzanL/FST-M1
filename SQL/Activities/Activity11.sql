--Write a query that produces the name and number of each salesman and each customer with 
--more than one current order. Put the results in alphabetical order.

SELECT customer_id AS ID ,  cust_name AS NAME
FROM customer CU
WHERE 1<
(SELECT COUNT (*)
FROM orders O
WHERE CU.customer_id = O.customer_id)
UNION
(SELECT salesman_id AS ID,SALESMAN_NAME AS NAME
FROM salesman S
WHERE 1 <
(SELECT COUNT (*)
FROM orders O
WHERE  S.salesman_id = 0.salesman_id))
ORDER BY NAME;


-- Write a query to make a report of which salesman produce the largest and smallest orders on each date.

SELECT a.salesman_id, name, order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, name, order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);