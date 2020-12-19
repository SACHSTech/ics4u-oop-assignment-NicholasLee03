package HR_System;

import java.io.*;
import HR_System.*;

public class Workplace {

  public static void main(String[] args) throws IOException{

    String choice;
    String username;
    String password;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(" ");
    System.out.println("Welcome to the NL Human Resources Information System 3000");
    System.out.println("Please enter your username and password: ");
    System.out.print("Username: ");
    username = keyboard.readLine();
    System.out.print("Password: ");
    password = keyboard.readLine();

    System.out.println("\nSelect one of the options below to view their information: ");
    System.out.println("1 - CEO");
    System.out.println("2 - Software Development Managers");
    System.out.println("3 - Software Developers");

		choice = keyboard.readLine();

    while (choice.equals("1") || choice.equals("3") || choice.equals("3")) {

      if (choice.equals("1")) {
        CEO Daenerys;
        Daenerys = new CEO("Daenerys", "Targaryen", "34 Iron Throne Rd.", "Peanut Allergy", 5000000);
        System.out.println(Daenerys);
        
        System.out.println("Please choose again");
		    choice = keyboard.readLine();
      }

      if (choice.equals("2")) {
        Manager Jon;
        Jon = new Manager("Jon", "Snow", "23 The Wall Rd.", "Asthma", 150000, "Music App");
        System.out.println(Jon);
        
        System.out.println("Please choose again");
		    choice = keyboard.readLine();
      }

      if (choice.equals("3")) {
        Developer Sansa;
        Sansa = new Developer("Sansa", "Stark", "59 Winterfell Cres.", "n/a", 70000, 90);
        System.out.println(Sansa);

        Developer Tyrion;
        Tyrion = new Developer("Tyrion", "Lannister", "75 Casterly Street", "Shellfish Allergy", 70000, 88);
        System.out.println(Tyrion);

        System.out.println("Total Number of Developers: " + Developer.getTotalDevelopers());

        System.out.println("Please choose again");
		    choice = keyboard.readLine();
      }


    }

  }

}

