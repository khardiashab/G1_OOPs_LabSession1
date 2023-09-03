package com.ajay.main;

import java.util.Scanner;

import com.ajay.model.Employee;
import com.ajay.services.Credientials;

public class DriverClass {
  public static void showDepartment(){

    System.out.println("--------------------------------------------------");
    System.out.println("Please Enter the department from the following");
    System.out.println("1. Technology");
    System.out.println("2. Admin");
    System.out.println("3. Human Resource");
    System.out.println("4. Legal");
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employee employee = new Employee("Ajay", "Khardia");
    Credientials cs = new Credientials();
    int departmentOption;
    showDepartment();
    departmentOption = sc.nextInt();
    if(!(departmentOption > 0 && departmentOption < 5)){
      System.out.println("Invalid department option.");
      sc.close();
      return;
    }
    // create and Set email
    cs.generateEmailAddress(employee, departmentOption);
    // cereate and set password 
    cs.generatePassword(employee);
    // show the details 
    cs.showCredentials(employee);
    sc.close();
    return;
  }
}
