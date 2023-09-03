package com.ajay.servicesInterface;

import com.ajay.model.Employee;

/**
 * This interface defines the methods related to generating and showing credentials for an employee.
 */
public interface ICredentials {
  
  /**
   * Generates a password for the given employee.
   * 
   * @param employee The employee for whom the password is to be generated.
   */
  public void generatePassword(Employee employee);
  
  /**
   * Generates an email address for the given employee based on the department option.
   * 
   * @param employee The employee for whom the email address is to be generated.
   * @param departmentOption The department option for which the email address is to be generated.
   */
  public void generateEmailAddress(Employee employee, int departmentOption);
  
  /**
   * Shows the credentials for the given employee.
   * 
   * @param employee The employee whose credentials are to be shown.
   */
  public void showCredentials(Employee employee);
}