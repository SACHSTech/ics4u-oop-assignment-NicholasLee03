package HR_System;

import HR_System.*;

public class Employee {

  private String firstName;
  private String lastName;
  private String homeAddress;
  private String medicalInfo;
  private int salary;

  public Employee(String fname, String lname, String address, String med, int sal){
    firstName = fname;
    lastName = lname;
    homeAddress = address;
    medicalInfo = med;
    salary = sal;
  }

  public String getFirstName(){
      return firstName;
  }
  
  public String getLastName(){
      return lastName;
  }

  public String getAddress(){
      return homeAddress;
  }
  
  public String getMedical(){
      return medicalInfo;
  }

  public int getSalary(){
      return salary;
  }
  
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Home Address: " + homeAddress);
    System.out.println("Medical Information: " + medicalInfo);
    System.out.println("Salary: $" + salary);
    return "--------------------------------------";
  }

}