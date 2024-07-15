## Sales Management System ##

# Problem Statement:
Design and implement a Sales Management System using Oracle SQL and PL/SQL. The system will be used to manage sales orders, customer information, and product inventory. Your task is to create the necessary database schema, populate the database with sample data, and develop PL/SQL procedures to handle sales order processing, customer management, and inventory tracking.

## Requirements:
 1. Sales Order Processing:
- Implement the functionality to add, update, delete, and search for sales orders.
- Ensure that each sales order has attributes such as `ORDER_ID`, `CUSTOMER_ID`, `PRODUCT_ID`, `QUANTITY`, `ORDER_DATE`, and `STATUS`.

 2. Customer Management:
- Implement the functionality to add, update, delete, and search for customer information.
- Ensure that each customer record has attributes such as `CUSTOMER_ID`, `FIRST_NAME`, `LAST_NAME`, `EMAIL`, and `PHONE_NUMBER`.

 3. Inventory Tracking:
- Implement the functionality to track product inventory.
- Ensure that each product record has attributes such as `PRODUCT_ID`, `PRODUCT_NAME`, `DESCRIPTION`, `PRICE`, and `AVAILABLE_QUANTITY`.

## Tasks:
 1. Design the Database Schema:
- Create the `SalesOrders`, `Customers`, and `Products` tables with the appropriate fields and constraints.
- Define primary keys and foreign keys to maintain data integrity.

 2. Populate the Database with Sample Data:
- Insert sample records into the `SalesOrders`, `Customers`, and `Products` tables to facilitate testing of the system.

 3. Develop PL/SQL Procedures:
- Create a procedure to handle sales order processing. The procedure should insert, update, and delete sales order records.
- Create a procedure to manage customer information. The procedure should insert, update, and delete customer records.
- Create a procedure to track product inventory. The procedure should update the available quantity of products after each sales order.

## Expected Outcomes:
1. SalesOrders Table:
   - Contains all information about the sales orders.
2. Customers Table:
   - Stores customer information.
3. Products Table:
   - Tracks product inventory.
4. PL/SQL Procedures:
   - Efficiently manage sales orders, customer information, and product inventory, maintaining accurate records in the database.

## Deliverables:
1. SQL scripts to create the `SalesOrders`, `Customers`, and `Products` tables.
2. SQL scripts to insert sample data into the tables.
3. PL/SQL scripts for the procedures to handle sales order processing, customer management, and inventory tracking.
4. Documentation explaining how to set up and use the system, including how to run the PL/SQL procedures.

## Database Schema:

1. SalesOrders Table:
- `ORDER_ID`: Number, Primary Key
- `CUSTOMER_ID`: Number, Foreign Key References `Customers(CUSTOMER_ID)`
- `PRODUCT_ID`: Number, Foreign Key References `Products(PRODUCT_ID)`
- `QUANTITY`: Number
- `ORDER_DATE`: Date
- `STATUS`: Varchar2(50)

2. Customers Table:
- `CUSTOMER_ID`: Number, Primary Key
- `FIRST_NAME`: Varchar2(50)
- `LAST_NAME`: Varchar2(50)
- `EMAIL`: Varchar2(100)
- `PHONE_NUMBER`: Varchar2(15)

3. Products Table:
- `PRODUCT_ID`: Number, Primary Key
- `PRODUCT_NAME`: Varchar2(100)
- `DESCRIPTION`: Clob
- `PRICE`: Number
- `AVAILABLE_QUANTITY`: Number


**Testing the Procedures:**

--Test Inventory Tracking:
EXEC update_inventory(1, 5, 'UPDATE')


--Test Sales Order Processing:
BEGIN 
    manage_sales_order(3, 3, 3, 2, SYSDATE,'INSERT', 'Completed'); 
    manage_sales_order(3, 1, 1, 2, SYSDATE,'UPDATE', 'Completed'); 
    manage_sales_order(4, 1, 1, 2, SYSDATE,'DELETE', 'Completed'); 
END;
/


--Test Customer Management:
BEGIN 
    manage_customer(3,'INSERT', 'Alice', 'Wonderland', 'alice.wonderland@example.com', '1122334455'); 
    manage_customer(3, 'UPDATE',  'Alice', 'Wonder', 'alice.wonder@example.com', '1122334466'); 
    manage_customer(3,'DELETE',  NULL, NULL, NULL, NULL); 
END;
/

