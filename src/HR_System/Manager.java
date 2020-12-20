package HR_System;

import HR_System.*;

public class Manager extends Employee {

  private String currentProject;
  private static int totalPayroll = 0;

  public Manager(String fname, String lname, String address, String med, int sal, String project){
    super(fname, lname, address, med, sal);
    currentProject = project;
    totalPayroll = totalPayroll + sal;
  }

  public static int getTotalPayroll(){
    return totalPayroll;
  }

  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: Software Development Manager");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Current Project: " + currentProject);
    return "--------------------------------------";
  }

}