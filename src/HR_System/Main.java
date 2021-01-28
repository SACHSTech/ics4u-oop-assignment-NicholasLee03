package HR_System;

import java.io.*;
import HR_System.*;
import java.util.ArrayList;

/**
* A program that allows the user to view and enter information pertaining to HR information for different employees. 
* The program displays the hierarchy of staff at a software development company with a CEO, Managers, and Developers.
* @author: N. Lee 
* 
*/
public class Main {

  public static void main(String[] args) throws IOException{

    // Initialize objects
    CEO SpongeBob;
    Manager Patrick;
    Manager Squidward;
    Manager newManager;
    Developer Sandy;
    Developer Eugene;
    Developer newDev;

    // Initialize variables
    String choice = "0";
    String username;
    String password;
    int totalPayroll;

		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Starting interface that asks for a username and password
    System.out.println(" ");
    System.out.println("Welcome to the NL Human Resources Information System 3000");
    System.out.println("Please enter your username (First Name) and password (Last Name)");
    System.out.print("Username: ");
    username = keyboard.readLine();
    System.out.print("Password: ");
    password = keyboard.readLine();

    if (username.equalsIgnoreCase("Eric") && password.equalsIgnoreCase("Fabroa")) {

      // Provides an ID# and states what information the user can access
      System.out.println("\nAcceptable Username and Password...Your secure ID# is 1100");
      System.out.println("Your clearance level grants you access to the private HR information below");
      System.out.println("1 - CEO");
      System.out.println("2 - Software Development Managers");
      System.out.println("3 - Software Developers");
      System.out.println("4 - HR Report");

      System.out.println("Please enter the secure passcode. E.g. 11001 for CEO or 11002 for Managers");

      choice = keyboard.readLine();

    } 
    
    // If the username or password is incorrect, the user must try again from the beginning 
    else if (!username.equalsIgnoreCase("Eric") && !password.equalsIgnoreCase("Fabroa")) {
      System.out.println("Incorrect Username/Password. Please try again later.");
      choice = "";
    }

    // Creates existing employees
    SpongeBob = new CEO("SpongeBob", "SquarePants", "34 Pineapple Rd.", "Peanut Allergy", 5000000, 10000);
    Sandy = new Developer("Sandy", "Cheeks", "59 Karate Ave.", "n/a", 70000, 90);
    Eugene = new Developer("Eugene", "Krabs", "75 Krusty Krab Rd.", "Shellfish Allergy", 70000, 88);
    Patrick = new Manager("Patrick", "Star", "23 Rock Rd.", "Asthma", 150000, "Meditation App");
    Squidward = new Manager("Squidward", "Tentacles", "9 Octopus Cres.", "Dog Allergy", 150000, "Music App");

    // Creates a company object
    Company theCompany = new Company(SpongeBob);

    // Adds esisting managers and developers to the arraylist
    theCompany.addManager(Patrick);
    theCompany.addManager(Squidward);
    theCompany.addDeveloper(Sandy);
    theCompany.addDeveloper(Eugene);

    // Allows the user to select any option and as many times as they want
    while (choice.equals("11001") || choice.equals("11002") || choice.equals("11003") || choice.equals("11004")) {

      // Displays HR information about the CEO
      if (choice.equals("11001")) {
        // Prints out the CEO
        System.out.println(SpongeBob);
        
        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      } 
      
      // Displays HR information about managers and allows the user to add managers
      if (choice.equals("11002")) {
        // Prints out the current managers
        theCompany.printManagers();          

        System.out.println("Enter 'yes' if you would like to add a new Manager or enter any other key for 'no'");
        String addManager = keyboard.readLine();

        // Allows the user to add as many managers as they want
        while (addManager.equalsIgnoreCase("yes")) {
          System.out.print("First Name: ");
          String fName = keyboard.readLine();

          System.out.print("Last Name: ");
          String lName = keyboard.readLine();

          System.out.print("Home Address: ");
          String address = keyboard.readLine();

          System.out.print("Medical Information: ");
          String medCondition = keyboard.readLine();

          System.out.print("Current Project: ");
          String project = keyboard.readLine();

          // Creates a new manager with given information and prints out the new developer
          newManager = new Manager(fName, lName, address, medCondition, 150000, project);
          theCompany.addManager(newManager);
          System.out.println(newManager);

          System.out.println("Enter 'yes' if you would like to add a new Manager or enter any other key for 'no'");
          addManager = keyboard.readLine();
        }

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      } 
      
      // Displays HR information about developers and allows the user to add developers
      if (choice.equals("11003")) {
        // Prints out the existing developers
        theCompany.printDevs();          

        // Asks the user if they would like to add another developer
        System.out.println("Enter 'yes' if you would like to add a new Developer or enter any other key for 'no'");
        String addDev = keyboard.readLine();

        // Allows the user to create another developer
        while (addDev.equalsIgnoreCase("yes")) {
          System.out.print("First Name: ");
          String fName = keyboard.readLine();

          System.out.print("Last Name: ");
          String lName = keyboard.readLine();

          System.out.print("Home Address: ");
          String address = keyboard.readLine();

          System.out.print("Medical Information: ");
          String medCondition = keyboard.readLine();

          System.out.print("Number of Working Hours (per week): ");
          int hours = Integer.parseInt(keyboard.readLine());

          // Creates a new developer with given information and prints out the new developer
          newDev = new Developer(fName, lName, address, medCondition, 70000, hours);
          theCompany.addDeveloper(newDev);
          System.out.println(newDev);

          System.out.println("Enter 'yes' if you would like to add a new Developer or enter any other key for 'no'");
          addDev = keyboard.readLine();
        }

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();
      }

      // Allows the user to view the HR summary report
      if (choice.equals("11004")) {

        // Prints out the HR Report
        System.out.println("\nBelow is the HR Overall Company Report");

        // States the number of employees for each level
        System.out.println("\nTotal Number of CEOs: 1");
        System.out.println("Total Number of Software Development Managers: " + theCompany.getNumManagers());
        System.out.println("Total Number of Software Developers: " + theCompany.getNumDev());

        // States the payroll for each level
        System.out.println("\nTotal Payroll for CEO: $" + CEO.getCEOPayroll());
        System.out.println("Total Payroll for Software Development Managers: $" + theCompany.getPayrollManager());
        System.out.println("Total Payroll for Software Developers Developers: $" + theCompany.getPayrollDev());

        // States the total payroll for all employees
        totalPayroll = CEO.getCEOPayroll() + theCompany.getPayrollManager() + theCompany.getPayrollDev();
        System.out.println("Total Payroll: $" + totalPayroll);

        // States specific attributes of each level
        System.out.println("\nCEO Bonus Pay: $" + SpongeBob.getCEOBonus());
        System.out.println("\nSoftware Developer Working Hours (per week)");
        theCompany.printDevHours();
        System.out.println("\nSoftware Development Manager Current Projects");
        theCompany.printManagerProject();

        // The user can view other menu options or exit the program
        System.out.println("\nPlease enter the secure passcode or any other key to exit");
        choice = keyboard.readLine();

      }

    }

  }

}
