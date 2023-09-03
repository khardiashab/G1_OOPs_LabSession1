package com.ajay.main;

import java.util.Scanner;

import com.ajay.model.Employee;
import com.ajay.services.Credentials;

public class DriverClass {

  public static void showDepartment() {
    String[] departments = { "Technology", "Admin", "Human Resource", "Legal" };

    System.out.println("--------------------------------------------------");
    System.out.println("Please Enter the department from the following");

    for (int i = 0; i < departments.length; i++) {
      System.out.println((i + 1) + ". " + departments[i]);
    }

    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employee employee = new Employee("Ajay", "Khardia");
    Credentials cs = new Credentials();
    int departmentOption;

    showDepartment();

    departmentOption = sc.nextInt();

    if (!(departmentOption > 0 && departmentOption < 5)) {
      // Invalid department option
      System.out.println("Invalid department option.");
      sc.close();
      return;
    }

    // Generate and set email
    cs.generateEmailAddress(employee, departmentOption);

    // Generate and set password
    cs.generatePassword(employee);

    // Show the credentials
    cs.showCredentials(employee);

    sc.close();
  }
}