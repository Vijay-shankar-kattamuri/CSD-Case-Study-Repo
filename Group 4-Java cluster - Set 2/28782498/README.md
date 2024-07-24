# Customer Loyalty Program

## OVERVIEW
The Customer Loyalty Program is a menu-based console application developed in Core Java using JDBC for database interactions with MySQL. The application allows users to manage customers, rewards, and purchases efficiently.

## Features
1. Customer Management:
   - Add a new customer
   - View customer details
   - Update customer information
   - Delete a customer

2. Reward Management:
   - Add a new reward
   - View reward details
   - Update reward information
   - Delete a reward

3. Purchase Management:
   - Add a new purchase
   - View purchase details
   - Update purchase information
   - Delete a purchase


## Database Schema

Customer Table
CREATE TABLE Customer (
    Customer_Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    Phone VARCHAR(15) UNIQUE NOT NULL,
    Total_Points INT DEFAULT 0
);
Reward Table
CREATE TABLE Reward (
    Reward_Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Points_Required INT NOT NULL,
    Description TEXT
);
Purchase Table
CREATE TABLE Purchase (
    Purchase_Id INT AUTO_INCREMENT PRIMARY KEY,
    Customer_Id INT,
    Reward_Id INT,
    Purchase_Date DATE NOT NULL,
    Points_Earned INT NOT NULL,
    FOREIGN KEY (Customer_Id) REFERENCES Customer(Customer_Id),
    FOREIGN KEY (Reward_Id) REFERENCES Reward(Reward_Id)
);


## Sample Data

Customer Table
INSERT INTO Customer (Name, Email, Phone, Total_Points) VALUES 
('Benita', 'benita@gmail.com', '897614532', 100),
('Anita', 'Anita@gmail.com', '785414532', 200),
('Reeda', 'reeda@gmail.com', '8903502240', 300);

Reward Table
INSERT INTO Reward (Name, Points_Required, Description) VALUES 
('10% Off Coupon', 100, 'A coupon for 10% off your next purchase.'),
('Free Coffee', 200, 'A coupon for a free coffee.'),
('Gift Card', 300, 'A $10 gift card.');

Purchase Table
INSERT INTO Purchase (customer_id, reward_id, purchase_date, points_earned) VALUES 
(1, 1, '2024-07-01', 100),
(2, 2, '2024-07-02', 200),
(3, 3, '2024-07-03', 300);

## Setup and Usage
Prerequisites
- JDK (Java Development Kit)
- MySQL
- MySQL JDBC Driver

 Database Setup
1. Install MySQL.
2. Create the database schema by running the provided SQL script `CustomerLoyaltyProgram_Database.sql;
SOURCE path_to_file/CustomerLoyaltyProgram_Database.sql;
   

## Java Project Setup
1. Ensure you have JDK installed.
2. Set up a new Java project in your preferred IDE.
3. Add the MySQL JDBC driver to your project's classpath.

## Running the Application
1. Compile the Java files.
2. Run `Main.java`.


## Application Structure
1. DatabaseConnection.java: Handles the connection to the MySQL database.
2. Customer.java: Represents the customer entity.
3. Reward.java: Represents the reward entity.
4. Purchase.java: Represents the purchase entity.
5. CustomerDAO.java: Data Access Object for customer operations.
6. RewardDAO.java: Data Access Object for reward operations.
7. PurchaseDAO.java: Data Access Object for purchase operations.
8. Main.java: Main class with the menu-driven console interface.

## Handling Exceptions
- The application handles SQL exceptions and provides user-friendly error messages.
- Ensures that connections, statements, and result sets are properly closed after operations.

## Code Conventions
- Follows standard Java coding conventions.
- Well-documented code with comments explaining the purpose of classes and methods.

## Conclusion
This application demonstrates how to build a menu-based console application in Java that interacts with a MySQL database using JDBC. 
It covers CRUD operations for managing customers, rewards, and purchases while handling exceptions and maintaining code quality.


