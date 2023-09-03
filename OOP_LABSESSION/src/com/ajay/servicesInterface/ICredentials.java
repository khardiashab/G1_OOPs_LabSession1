package com.ajay.servicesInterface;

import com.ajay.model.Employee;

public interface ICredentials {
  public void generatePassword(Employee employee);
  public void generateEmailAddress(Employee employee, int departmentOption);
  public void showCredentials(Employee employee);
}
