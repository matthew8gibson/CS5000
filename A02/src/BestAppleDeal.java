// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  2
// IDE Name:    VS Code

import java.util.Scanner;

public class BestAppleDeal {
  public static void main(String[] args) {
    // setup/input section
    // wrapper to optionally skip prompt, if cmdline parameter is entered.
    int inputValue;
    if (args.length == 0) {
      Scanner s = new Scanner(System.in);
      System.out.println();
      System.out.print("Please enter the small box weight in pounds: ");
      inputValue = s.nextInt();
      s.close(); // prompted in VS Code to close to free up resources
    } else {
      inputValue = Integer.parseInt(args[0]);
      String judgement;
    }
    // processing section - calculate the bigger deal.

    // output section
    System.out.println();
    System.out.println("Small box weight:\t" + inputValue + "Pounds");
    System.out.println("Small box price:\t" + inputValue + "Dollars");
    System.out.println("Large box weight:\t" + inputValue + "Pounds");
    System.out.println("Large box price:\t" + inputValue + "Dollars");
    System.out.println("Judgement: the" + " box is a better deal");

    // cleanup section, any resources to close?
  }
}
