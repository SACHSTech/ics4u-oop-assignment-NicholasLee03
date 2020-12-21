package HR_System;

import HR_System.*;

public class Developer extends Employee {

  private int hours;

  private static int totalDevelopers = 0;
  private static int devPayroll = 0;

  public Developer(String fname, String lname, String address, String med, int sal, int theHours){
    super(fname, lname, address, med, sal);
    hours = theHours;

    totalDevelopers++;
    devPayroll = devPayroll + sal;
  }

  public static int getTotalDevelopers(){
    return totalDevelopers;
  }

  public static int getDevPayroll(){
    return devPayroll;
  }

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