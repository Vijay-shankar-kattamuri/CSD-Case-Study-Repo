# Hospital Management System

## Overview

The Hospital Management System is a Java-based application designed to manage patients, doctors, and appointments in a hospital setting. This system provides an easy-to-use interface for users to add patients, view patient and doctor details, and book appointments efficiently.

## Features

- **Add Patient**: Users can add new patients to the system.
- **View Patients**: Users can view a list of all registered patients.
- **View Doctors**: Users can view a list of all registered doctors.
- **Book Appointment**: Users can book appointments between patients and doctors.
- **Exit**: Users can exit the application gracefully.

## Technologies Used

- Java
- MySQL
- JDBC (Java Database Connectivity)
- Scanner (for user input)

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- MySQL Server
- MySQL Workbench (optional, for database management)

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/hospital-management-system.git
   cd hospital-management-system


Create the Database:
Open your MySQL client and execute the following SQL commands to create the necessary tables:

CREATE DATABASE hospital;

USE hospital;

CREATE TABLE Patient (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    date_of_birth DATE NOT NULL,
    gender ENUM('M', 'F', 'O') NOT NULL,
    contact_number VARCHAR(15) NOT NULL
);

CREATE TABLE Doctor (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    specialization VARCHAR(100) NOT NULL,
    contact_number VARCHAR(15) NOT NULL
);

CREATE TABLE Appointments (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL,
    FOREIGN KEY (patient_id) REFERENCES Patient(patient_id),
    FOREIGN KEY (doctor_id) REFERENCES Doctor(doctor_id)
);


Configure Database Connection:
Update the database connection details in the HospitalManagementSystem.java file:
java
private static final String URL = "jdbc:mysql://localhost:3306/hospital";
private static final String USERNAME = "root";
private static final String PASSWORD = "2503"; // Update with your MySQL password


Compile and Run the Application:
Compile the Java files:
bash
javac HospitalManagementSystem/*.java

Run the main application:
bash
java HospitalManagementSystem.HospitalManagementSystem


Usage
Follow the on-screen prompts to add patients, view patient and doctor details, and book appointments.
Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for any improvements or bugs.


Acknowledgments
Inspired by various hospital management systems and Java tutorials.
text

### Instructions for Use

1. **Copy the Markdown**: Copy the above text into a file named `README.md`.

2. **Customize the Repository Link**: Replace `https://github.com/yourusername/hospital-management-system.git` with the actual URL of your GitHub repository.

3. **Update Password Placeholder**: Ensure that the placeholder for the MySQL password is correct.

4. **Add License Information**: If you have a specific license for your project, ensure that you mention it in the License section.

5. **Commit and Push**: Add the `README.md` file to your Git repository, commit the changes, and push it to GitHub.

```bash
git add README.md
git commit -m "Add README file"
git push origin main

This README file provides a comprehensive overview of your project, setup instructions, and usage guidelines, making it easier for others to understand and contribute to your project.


