# Health Insurance Management System

This is a menu-based console application for managing health insurance policies, members, and claims. The application demonstrates the use of Core Java, MySQL, and JDBC for database interaction.

## Functionalities
1. **Policy Management:**
   - Add a new policy
   - View policy details
   - Update policy information
   - Delete a policy

2. **Member Management:**
   - Register a new member
   - View member details
   - Update member information
   - Delete a member

3. **Claim Management:**
   - Submit a new claim
   - View claim details
   - Update claim information
   - Delete a claim

## Database Schema
- **Policy Table:**
  - policy_id (Primary Key)
  - policy_number
  - type
  - coverage_amount
  - premium_amount

- **Member Table:**
  - member_id (Primary Key)
  - name
  - date_of_birth
  - email
  - phone_number

- **Claim Table:**
  - claim_id (Primary Key)
  - policy_id (Foreign Key references Policy Table)
  - member_id (Foreign Key references Member Table)
  - claim_date
  - status (submitted/processed)

## Setup Instructions
1. Install MySQL and create the `healthinsurance_db` database using the provided SQL script.
2. Set up the Java project and add the MySQL JDBC driver.
3. Update the database connection details (`JDBC_URL`, `JDBC_USER`, `JDBC_PASSWORD`) in the `InsuranceManagementSystem` class.
4. Run the `InsuranceManagementSystem` class to start the application.

## Running the Application
- Run the `main` method in the `InsuranceManagementSystem` class.
- Follow the on-screen menu to navigate and perform different operations.
