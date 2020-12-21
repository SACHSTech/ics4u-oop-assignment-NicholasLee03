package HR_System;

import HR_System.*;

public class Developer extends Employee {

  // Instance variable
  private int hours;

  // Class variables
  private static int totalDevelopers = 0;
  private static int devPayroll = 0;

  /**
    * Constructor - creates a new Developer instance
    * @param fname - the Developer's first name
    * @param lname - the Developer's last name
    * @param address - the Developer's home address
    * @param med - the Developer's medical information
    * @param sal - the Developer's salary
    * @param theHours - the Developer's hours
    */
  public Developer(String fname, String lname, String address, String med, int sal, int theHours){

    // Triggers a parent constructor in Employee class
    super(fname, lname, address, med, sal);
    hours = theHours;

    // Tracks the number of developers and calculates the total payroll for the developers
    totalDevelopers++;
    devPayroll = devPayroll + sal;
    
  }

  /**
  * Getter method for total number of developers
  * @return total number of developers
  */
  public static int getTotalDevelopers(){
    return totalDevelopers;
  }

  /**
  * Getter method for Developer's payroll
  * @return Developer's payroll
  */
  public static int getDevPayroll(){
    return devPayroll;
  }

  /**
  * String representation of a Developer
  * @return all the attributes regarding a Developer
  */
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: Software Developer");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Number of Hours Worked: " + hours);
    return "--------------------------------------";
  }

}