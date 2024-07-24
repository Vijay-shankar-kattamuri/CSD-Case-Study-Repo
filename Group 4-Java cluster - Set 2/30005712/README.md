# Automobile Inventory Management System

## Overview

This is a basic automobile inventory management system implemented in Java using JDBC and MySQL. The application allows users to manage vehicles, customers, and sales transactions.

## Database Setup

1. Install MySQL and create a new database:
    ```sql
    CREATE DATABASE Automobile_Inventory;

    USE Automobile_Inventory;

    CREATE TABLE Vehicle(
    vehicle_id INT PRIMARY KEY,
    make VARCHAR(50),
    model VARCHAR(50),
    year INT,
    price DECIMAL(10, 2),
    available_quantity INT
    );

    CREATE TABLE Customer(
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    email VARCHAR(100),
    phone_number VARCHAR(15)
    );

    CREATE TABLE SalesTransaction(
    transaction_id INT PRIMARY KEY,
    vehicle_id INT,
    FOREIGN KEY (vehicle_id) REFERENCES Vehicle(vehicle_id),
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
    transaction_date DATE,
    amount DECIMAL(10, 2)
    );
    ```
2. Update the MySQL credentials in the Main.java file:
    ```java
    private static final String username = "root";
    private static final String password = "password"; // Change to your MySQL password
    ```
    
## Running the Application

1. Compile the Java files (Terminal):
    ```sh
    javac Main.java

2. Run the application on:
   IntelliJ IDE

## Usage

The application provides the following functionalities through a menu-based interface:

## Vehicle Management

1. Add vehicle
2. Vew vehicles
3. Update vehicle
4. Delete vehicle
5. Back to main menu

## Customer Management

1. Add customer
2. Vew customers
3. Update customer
4. Delete customer
5. Back to Main Menu

## Sales Transaction Management

1. Record vehicle sales
2. View sales transaction details
3. Generate sales reports
4. Calculate total sales revenue

Follow the prompts to perform the desired operations.
