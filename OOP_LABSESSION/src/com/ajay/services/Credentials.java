package com.ajay.services;

import java.util.Random;

import com.ajay.model.Employee;
import com.ajay.servicesInterface.ICredentials;

public class Credentials implements ICredentials {

    /**
     * Generates the email address for the employee based on the department option.
     *
     * @param employee         The employee for whom the email address is generated.
     * @param departmentOption The department option.
     */
  @Override
  public void generateEmailAddress(Employee employee, int departmentOption) {
    // Build the email address
    StringBuilder emailBuilder = new StringBuilder();
    emailBuilder.append(employee.getFirstName().toLowerCase());
    emailBuilder.append(employee.getLastName().toLowerCase());
    emailBuilder.append("@");
    emailBuilder.append(employee.getDepartment(departmentOption - 1));
    emailBuilder.append(".");
    emailBuilder.append(employee.getCompany());
    emailBuilder.append(".com");
    employee.setEmail(emailBuilder.toString());
  }

    /**
     * Generates a random password for the employee.
     *
     * @param employee The employee for whom the password is generated.
     */
  @Override
  public void generatePassword(Employee employee) {
    Random random = new Random();
    String password; 
    int passwordLength = 8;
        StringBuilder stringBuilder = new StringBuilder();
    
    // Generate a random password
        for (int i = 0; i < passwordLength; i++) {
      char characterToAdd = (char) (random.nextInt(94) + 33);
      stringBuilder.append(characterToAdd);
    }
    
    password = stringBuilder.toString();
    employee.setPassword(password);    
  }

    /**
     * Displays the generated credentials for the employee.
     *
     * @param employee The employee whose credentials are displayed.
     */
  @Override
  public void showCredentials(Employee employee) {
    System.out.println("----------------------------------------------------");
    System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
    System.out.println("Email ----> " + employee.getEmail());
    System.out.println("Password ----> " + employee.getPassword());
  }
}