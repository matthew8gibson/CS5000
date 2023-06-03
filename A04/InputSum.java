
// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  4
// IDE Name:    VS Code

import java.util.Scanner;

public class InputSum {
  public static void main(String[] args) {
    // setup/input section
    // wrapper to optionally skip prompt, if cmdline parameter is entered.
    int inputValue;
    if (args.length == 0) {
      Scanner s = new Scanner(System.in);
      System.out.println();
      System.out.print("Please enter a 5-digits integer value:");
      inputValue = s.nextInt();
      s.close(); // prompted in VS Code to close to free up resources
    } else {
      inputValue = Integer.parseInt(args[0]);
    }
    // processing section

    // output section
    System.out.println();
    System.out.println("Input Value:\t" + inputValue);

    // cleanup section, any resources to close?
  }
}
