package HR_System;

import HR_System.*;

/**
* Super class
*/
public class Employee {

  // Instance Variables
  private String firstName;
  private String lastName;
  private String homeAddress;
  private String medicalInfo;
  private int salary;

  /**
    * Constructor - creates a new employee instance
    * @param fname - the employee's first name
    * @param lname - the employee's last name
    * @param address - the employee's home address
    * @param med - the employee's medical information
    * @param sal - the employee's salary
    */
  public Employee(String fname, String lname, String address, String med, int sal){

    firstName = fname;
    lastName = lname;
    homeAddress = address;
    medicalInfo = med;
    salary = sal;
    
  }

  /**
  * Getter method for employee's first name
  * @return employee's first name
  */
  public String getFirstName(){
    return firstName;
  }
  
  /**
  * Getter method for employee's last name
  * @return employee's last name
  */
  public String getLastName(){
    return lastName;
  }

  /**
  * Getter method for employee's home address
  * @return employee's home address
  */
  public String getAddress(){
    return homeAddress;
  }

  /**
  * Getter method for employee's medical information
  * @return employee's medical information
  */
  public String getMedical(){
    return medicalInfo;
  }

  /**
  * Getter method for employee's salary
  * @return employee's salary
  */
  public int getSalary(){
    return salary;
  }
  
}