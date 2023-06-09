// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  5
// IDE Name:    VS Code

import java.util.Scanner;

public class KeyPad {
  public static void main(String[] args) {
    // setup/input section
    // wrapper to optionally skip prompt, if cmdline parameter is entered.
    int inputValue;

    Scanner s = new Scanner(System.in);
    System.out.println();
    System.out.print("Please enter a 5-digits integer value:");
    inputValue = s.nextInt();
    s.close();
    // processing section

    // output section
    System.out.println();
    System.out.println("Input Value:\t" + inputValue);

    // cleanup section, any resources to close?

  }
}
