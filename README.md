# G1_OOPs_LabSession1
## Employee Credential Generation Application

This application is designed to generate credentials for new hires. As an IT Support Administrator, your task is to create email addresses and passwords for new employees. The application performs the following tasks:

1. Generates an email address for each employee using the following syntax:  `firstNamelastName@department.company.com` .
2. Determines the department of the employee (Technical, Admin, Human Resource, Legal).
3. Generates a random password that includes a number, a capital letter, a small letter, and a special character.
4. Displays the generated credentials for each employee.

## Usage Instructions

To use this application, follow the steps below:

1. Run the application.
2. Select the department of the employee from the available options (Technical, Admin, Human Resource, Legal).
3. The application will generate an email address and a random password for the employee.
4. The generated credentials will be displayed on the screen.

## Implementation Details

The application is implemented using Java programming language. It consists of the following classes:

1.  `Employee`  class: This class represents an employee and stores their first name, last name, email, and password. It provides getter and setter methods for accessing and modifying employee details.

2.  `CredentialService`  class: This class is responsible for generating passwords, email addresses, and displaying credentials. It contains the following methods:
   -  `generatePassword()` : Generates a random password for an employee.
   -  `generateEmailAddress()` : Generates an email address for an employee based on their first name, last name, and department.
   -  `showCredentials()` : Displays the generated credentials for an employee.

3.  `DriverClass`  class: This class contains the main method and acts as the entry point of the application. It interacts with the user, creates an instance of the  `Employee`  class, and utilizes the  `CredentialService`  class to generate and display credentials.

## Dependencies

This application does not have any external dependencies. It only requires a Java Runtime Environment (JRE) to run.

## Getting Started

To run this application, follow the steps below:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Build and run the  `DriverClass`  class.
4. Follow the on-screen instructions to generate credentials for new employees.

## Future Enhancements

Here are some potential enhancements that can be made to this application:

1. Implement a database or file system to store and retrieve employee credentials.
2. Add validation checks for user inputs to ensure data integrity.
3. Implement password strength requirements to enhance security.
4. Allow customization of department names and email domain.
5. Implement a user interface for a more user-friendly experience.

