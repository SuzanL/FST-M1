SELECT DISTINCT SALESMAN_ID FROM orders;

SELECT order_no ,order_date FROM orders
ORDER BY order_date ASC;

SELECT order_no,purchase_amount FROM orders
ORDER BY purchase_amount DESC;

SELECT * FROM orders
WHERE purchase_amount <500;

SELECT * FROM orders
WHERE purchase_amount BETWEEN 1000 AND 2000;