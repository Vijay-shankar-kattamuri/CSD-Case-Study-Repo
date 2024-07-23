# Insurance Management System

## Introduction
This is a simple Insurance Management System console application developed in Java using JDBC to interact with a MySQL database. The application allows users to manage policies, customers, and claims.

## Prerequisites
- Java Development Kit (JDK)
- MySQL Database
- MySQL Connector/J (JDBC driver for MySQL)

## Database Setup
1. Create a database named `InsuranceDB` and the necessary tables by running the following SQL script:

## sql
CREATE DATABASE InsuranceDB;

USE InsuranceDB;

CREATE TABLE Policy (
    policy_id INT AUTO_INCREMENT PRIMARY KEY,
    policy_number VARCHAR(20) NOT NULL,
    type VARCHAR(50) NOT NULL,
    coverage_amount DECIMAL(10, 2) NOT NULL,
    premium_amount DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    address TEXT NOT NULL
);

CREATE TABLE Claim (
    claim_id INT AUTO_INCREMENT PRIMARY KEY,
    policy_id INT,
    customer_id INT,
    claim_date DATE NOT NULL,
    status VARCHAR(20) NOT NULL,
    FOREIGN KEY (policy_id) REFERENCES Policy(policy_id),
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
);


## Project Structure

1. Insurance Management System

   1.1 src
       1.1.1 insuranceMangementSystem
             1.1.1.1  DatabaseConnetion.java
             1.1.1.2  InsuranceManagementSystem.java
             1.1.1.3  Policy.java
             1.1.1.4  Customer.java
             1.1.1.5  Claim.java
           
   1.2 lib
        1.2.1 mysql-connector-java-8.0.28
           
