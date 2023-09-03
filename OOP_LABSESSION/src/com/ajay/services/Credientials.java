package com.ajay.services;

import java.util.Random;

import com.ajay.model.Employee;
import com.ajay.servicesInterface.ICredentials;

public class Credientials implements ICredentials {

  @Override
  public void generateEmailAddress(Employee employee, int departmentOption) {
    employee.setEmail(employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" +  employee.getDepartment(departmentOption -1) + "." + employee.getCompany() + ".com");    
    
  }

  @Override
  public void generatePassword(Employee employee) {
    Random random = new Random();
    String password; 
    int passwordLength = 8;
    StringBuilder stringBuilder = new StringBuilder("");
    
    for( int i = 0; i < passwordLength; i++){
      char characterToAdd = (char) (random.nextInt(94) + 33);
      stringBuilder.append(characterToAdd);
    }
    password = stringBuilder.toString();
    employee.setPassword(password);    
  }

  @Override
  public void showCredentials(Employee employee) {
    System.out.println("----------------------------------------------------");
    System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
    System.out.println("Email ----> " + employee.getEmail());
    System.out.println("Password ----> " + employee.getPassword());
    
  }
  
}
