package HR_System;

import HR_System.*;

public class CEO extends Employee {

  private int bonusPay;
  private static int ceoPayroll = 0;

  public CEO(String fname, String lname, String address, String med, int sal, int bonus){
    super(fname, lname, address, med, sal);
    bonusPay = bonus;

    ceoPayroll = sal + bonus;
  }

  public static int getCEOPayroll(){
    return ceoPayroll;
  }

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