package HR_System;

import java.io.*;
import HR_System.*;

public class Workplace {

  public static void main(String[] args) throws IOException{

    String choice;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(" ");
    System.out.println("Welcome to the NL Human Resources Information System 3000");
    System.out.println("Please select one of the options below: ");
    System.out.println("1 - CEO");
    System.out.println("2 - Software Development Managers");
    System.out.println("3 - Software Developers");

		choice = keyboard.readLine();

    while (choice.equals("1") || choice.equals("3") || choice.equals("3")) {

      if (choice.equals("1")) {
        Developer nick;
        nick = new Developer("Nick", "Lee", "123 Star Street", "n/a", 90000, 90);
        System.out.println(nick);

        System.out.println("Please choose again");
		    choice = keyboard.readLine();
      }
      
      if (choice.equals("2")) {
        Manager Dave;
        Dave = new Manager("Dave", "Lee", "123 Star Street", "n/a", 90000, "Music App");
        System.out.println(Dave);
        
        System.out.println("Please choose again");
		    choice = keyboard.readLine();
      }

    }



  }

}

