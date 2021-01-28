package HR_System;

import HR_System.*;
import java.util.ArrayList;

public class Manager extends Employee {

  // Instance variable
  private String currentProject;

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
  }

  /**
  * Getter method for manager's current project
  * @return manager's current project
  */
  public String getCurrentProject(){
    return currentProject;
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