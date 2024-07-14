E-commerce Platform Console Application

This Java console application simulates an e-commerce platform where users can manage products, orders, and customers. It uses MySQL for data storage and JDBC for database interactions.


Features:
Product Management: Add, view, update, and delete products.
Order Management: Place orders, view order details, update order status, and cancel orders.
Customer Management: Register new customers, view customer details, update customer information, and delete customers.

Prerequisites
Before running the application, ensure you have the following installed:

Java Development Kit (JDK) 8 or higher
Apache Maven
Spring tool Suite 4(IDE)
MySQL Server or MySQL Workbench

git clone https://github.com/your-username/ecommerce-platform.git
cd ecommerce-platform


Database Setup:

Create a MySQL database named ecommerce:

sql

CREATE DATABASE ecommerce;

Set up tables using the provided SQL schema (ecommerce.sql):

bashmysql -u root -p ecommerce < ecommerce.sql



Configure Database Connection:

Open src/main/resources/application.properties and update the database URL, username, and password:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=your_password

Build and Run
java -jar target/ecommerce-platform-0.0.1-SNAPSHOT.jar


Dependencies
Spring Boot
MySQL Connector/J
JUnit 5 (for unit testing)
Maven (for build management)

Contributing
Contributions are welcome! Feel free to fork the repository, create pull requests, or open issues for any suggestions or bugs.

License
This project is licensed under the MIT License - see the LICENSE file for details.


