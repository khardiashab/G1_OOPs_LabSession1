package com.ajay.model;

public class Employee {
    private static final String COMPANY = "techHub";
    private static final String[] DEPARTMENT = { "tech", "admin", "hr", "legal" };

  private String firstName;
  private String lastName;
  private String email;
  private String password;

  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getCompany() {
        return COMPANY;
  }

    /**
     * Returns the department at the given index.
     * 
     * @param index the index of the department
     * @return the department at the given index
     */
  public String getDepartment(int index) {
        return DEPARTMENT[index];
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}