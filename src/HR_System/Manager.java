package HR_System;

import HR_System.*;

public class Manager extends Employee {

  // Instance variable
  private String currentProject;

  // Class variables
  private static int managerPayroll = 0;
  private static int totalManagers = 0;

  /**
    * Constructor - creates a new Manager instance
    * @param fname - the Manager's first name
    * @param lname - the Manager's last name
    * @param address - the Manager's home address
    * @param med - the Manager's medical information
    * @param sal - the Manager's salary
    * @param project - the Manager's project
    */
  public Manager(String fname, String lname, String address, String med, int sal, String project){
    
    // Triggers a parent constructor in Employee class
    super(fname, lname, address, med, sal);
    currentProject = project;

    // Calculates the payroll for all the managers and tracks the number of managers
    managerPayroll = managerPayroll + sal;
    totalManagers++;
  }

  /**
  * Getter method for Manager's payroll
  * @return Manager's payroll
  */
  public static int getManagerPayroll(){
    return managerPayroll;
  }

  /**
  * Getter method for the number of managers
  * @return total number of managers
  */
  public static int getTotalManagers(){
    return totalManagers;
  }

  /**
  * String representation of a Manager
  * @return all the attributes regarding a Manager
  */
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