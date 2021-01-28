package HR_System;

import HR_System.*;

public class CEO extends Employee {

  // Instance variable
  private int bonusPay;

  // Class variable
  private static int ceoPayroll = 0;

  /**
    * Constructor - creates a new CEO instance
    * @param fname - the CEO's first name
    * @param lname - the CEO's last name
    * @param address - the CEO's home address
    * @param med - the CEO's medical information
    * @param sal - the CEO's salary
    * @param bonus - the CEO's bonus
    */
  public CEO(String fname, String lname, String address, String med, int sal, int bonus){
    // Triggers a parent constructor in Employee class
    super(fname, lname, address, med, sal);
    bonusPay = bonus;

    // Calculates the total payroll for the CEO
    ceoPayroll = sal + bonus;
  }

  /**
  * Getter method for CEO's payroll
  * @return CEO's payroll
  */
  public static int getCEOPayroll(){
    return ceoPayroll;
  }

  /**
  * Getter method for CEO's bonus
  * @return CEO's bonus
  */
  public int getCEOBonus(){
    return bonusPay;
  }

  /**
  * String representation of a CEO
  * @return all the attributes regarding a CEO
  */
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: CEO");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Bonus: $" + bonusPay);
    return "--------------------------------------";
  }

}