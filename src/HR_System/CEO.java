package HR_System;

import HR_System.*;

public class CEO extends Employee {

  public CEO(String fname, String lname, String address, String med, int sal){
    super(fname, lname, address, med, sal);
  }

  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: CEO");
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Home Address: " + getAddress());
    System.out.println("Medical Information: " + getMedical());
    System.out.println("Salary: $" + getSalary());
    return "--------------------------------------";
  }


}