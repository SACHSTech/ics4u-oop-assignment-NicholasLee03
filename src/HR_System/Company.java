package HR_System;

import java.io.*;
import HR_System.*;
import java.util.ArrayList;

public class Company {

  // Instance Variables
  private CEO ceo;
  private ArrayList<Developer> developers;
  private ArrayList<Manager> managers;

  /**
    * Constructor - creates a new company instance
    * @param theCEO - the CEO
    */
  public Company(CEO theCEO){
    ceo = theCEO;
    // Initializes the developers and managers lists
    developers = new ArrayList<Developer>();
    managers = new ArrayList<Manager>();
  }

  /**
  * Method allows for the adding of a developer
  * @return void
  */
  public void addDeveloper(Developer newDev){
    developers.add(newDev);
  }

  /**
  * Method allows for the adding of a manager
  * @return void
  */
  public void addManager(Manager newManager){
    managers.add(newManager);
  }

  /**
  * Method allows for getting number of developers
  * @return number of developers
  */
  public int getNumDev(){
    return developers.size();
  }

  /**
  * Method allows for getting number of managers
  * @return number of developers
  */
  public int getNumManagers(){
    return managers.size();
  }

  /**
  * Method allows for getting the total developer payroll
  * @return total payroll for developers
  */
  public int getPayrollDev(){
    int totalPayroll = 0;
    for(int i = 0; i < getNumDev(); i++){
      totalPayroll = totalPayroll + developers.get(i).getSalary();
    }
    return totalPayroll;
  }

  /**
  * Method allows for getting the total manager payroll
  * @return total payroll for managers
  */
  public int getPayrollManager(){
    int totalPayroll = 0;
    for(int i = 0; i < getNumManagers(); i++){
      totalPayroll = totalPayroll + managers.get(i).getSalary();
    }
    return totalPayroll;
  }

  /**
  * Method allows for the printing out of all the managers
  * @return void
  */
  public void printManagers(){
    for (int i = 0; i < getNumManagers(); i++) {
      System.out.println(managers.get(i));
    }
  }

  /**
  * Method allows for the printing out of all the developers
  * @return void
  */
  public void printDevs(){
    for (int i = 0; i < getNumDev(); i++) {
      System.out.println(developers.get(i));
    }
  }

  /**
  * Method allows for the printing out of all the developers' hours
  * @return void
  */
  public void printDevHours(){
    for (int i = 0; i < getNumDev(); i++) {
      System.out.println(developers.get(i).getFirstName() + " " + developers.get(i).getLastName() + ": " + developers.get(i).getHours());
    }
  }

  /**
  * Method allows for the printing out of all the managers' current projects
  * @return void
  */
  public void printManagerProject(){
    for (int i = 0; i < getNumManagers(); i++) {
      System.out.println(managers.get(i).getFirstName() + " " + managers.get(i).getLastName() + ": " + managers.get(i).getCurrentProject());
    }
  }

}