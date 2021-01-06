package HR_System;

import java.io.*;
import HR_System.*;

/**
* A program that allows the user to view and enter information pertaining to HR information for different employees. 
* The program displays the hierarchy of staff at a software development company with a CEO, Managers, and Developers.
* @author: N. Lee 
* 
*/
public class Workplace {

  public static void main(String[] args) throws IOException{

    // Initialize objects
    CEO SpongeBob;
    Manager Patrick;
    Manager Squidward;
    Developer Sandy;
    Developer Eugene;
    Developer newDev;

    // Initialize variables
    String choice = "0";
    String username;
    String password;
    int totalPayroll;
    int bonus;

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

      // Describes how the user can access the informatin at each level
      System.out.println("\nTo access each level you must enter a passcode which is your ID# and the level. E.g. 11001 for CEO, 11002 for Managers, and etc.");
      System.out.println("The system will begin at the highest level of the company and go down the staff hierarchy");
      System.out.println("Please enter the secure passcode to access the CEO HR information (Level 1)");

      choice = keyboard.readLine();

    } 
    
    // If the username or password is incorrect, the user must try again from the beginning 
    else if (!username.equalsIgnoreCase("Eric") && !password.equalsIgnoreCase("Fabroa")) {
      System.out.println("Incorrect Username/Password. Please try again later.");
      choice = "";
    }

    if (choice.equals("11001")) {

      // The user can enter an amount of bonus for the CEO 
      System.out.print("Enter the bonus amount for the CEO: ");
      bonus = Integer.parseInt(keyboard.readLine());

      // Creates the CEO
      SpongeBob = new CEO("SpongeBob", "SquarePants", "34 Pineapple Rd.", "Peanut Allergy", 5000000, bonus);
      System.out.println(SpongeBob);
      
      // The user must enter the passcode to continue
      System.out.println("\nPlease enter the secure passcode to access the Software Development Manager HR information (Level 2)");
      choice = keyboard.readLine();

    } 
    
    // Prevents the user from accessing the lower levels
    else if (choice.equals("11002") || choice.equals("11003") || choice.equals("11004")) {
      System.out.println("\nIncorrect passcode. You must exit and try again");   
      choice = ""; 
    }

    if (choice.equals("11002")) {

      // Creates a manager
      Patrick = new Manager("Patrick", "Star", "23 Rock Rd.", "Asthma", 150000, "Meditation App");
      System.out.println(Patrick);

      // Creates a second manager
      Squidward = new Manager("Squidward", "Tentacles", "9 Octopus Cres.", "Dog Allergy", 150000, "Music App");
      System.out.println(Squidward);
      
      // The user must enter the passcode to continue
      System.out.println("\nPlease enter the secure passcode to access the Software Developer HR information (Level 3)");
      choice = keyboard.readLine();

    } 
    
    // Prevents the user from accessing the lower levels
    else if (choice.equals("11003") || choice.equals("11004")) {
      System.out.println("\nIncorrect passcode. You must exit and try again");   
      choice = ""; 
    }

    if (choice.equals("11003")) {

      // Creates a developer
      Sandy = new Developer("Sandy", "Cheeks", "59 Karate Ave.", "n/a", 70000, 90);
      System.out.println(Sandy);

      // Creates a second developer
      Eugene = new Developer("Eugene", "Krabs", "75 Krusty Krab Rd.", "Shellfish Allergy", 70000, 88);
      System.out.println(Eugene);

      // Asks the user if they would like to add another developer
      System.out.println("Enter 'yes' if you would like to add a new Developer or enter any other key for 'no'");
      String addDev = keyboard.readLine();

      // Allows the user to create another developer
      if (addDev.equalsIgnoreCase("yes")) {

        System.out.print("First Name: ");
        String fName = keyboard.readLine();

        System.out.print("Last Name: ");
        String lName = keyboard.readLine();

        System.out.print("Home Address: ");
        String address = keyboard.readLine();

        System.out.print("Medical Information: ");
        String medCondition = keyboard.readLine();

        // Creates a new developer with given information and prints out the new developer
        newDev = new Developer(fName, lName, address, medCondition, 70000, 0);
        System.out.println(newDev);

      }

      // The user must enter the passcode to continue
      System.out.println("\nPlease enter the secure passcode to access the HR Report (Level 4)");
      choice = keyboard.readLine();

    } 
    
    // Prevents the user from accessing the lower level
    else if (choice.equals("11004")) {
      System.out.println("\nIncorrect passcode. You must exit and try again");   
      choice = ""; 
    }

    if (choice.equals("11004")) {

      // Prints out the HR Report
      System.out.println("\nBelow is the HR Overall Company Report");

      // States the number of employees for each level
      System.out.println("Total Number of CEOs: 1");
      System.out.println("Total Number of Software Development Managers: " + Manager.getTotalManagers());
      System.out.println("Total Number of Software Developers: " + Developer.getTotalDevelopers());

      // States the payroll for each level
      System.out.println("\nTotal Payroll for CEO: $" + CEO.getCEOPayroll());
      System.out.println("Total Payroll for Software Development Managers: $" + Manager.getManagerPayroll());
      System.out.println("Total Payroll for Software Developers Developers: $" + Developer.getDevPayroll());

      // States the total payroll for all employees
      totalPayroll = CEO.getCEOPayroll() + Manager.getManagerPayroll() + Developer.getDevPayroll();
      System.out.println("Total Payroll: $" + totalPayroll);

    } 
    
    // If the user inputs a wrong passcode at any level they must start again from the beginning
    else if (!choice.equals("")) {
      System.out.println("\nIncorrect passcode. You must exit and try again");    
    }

  }

}
