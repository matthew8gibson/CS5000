// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  3
// IDE Name:    VS Code

import java.util.Scanner;

public class StringMethods {
  public static void main(String[] args) {

    // setup/input section
    // wrapper to optionally skip prompt, if cmdline parameter is entered.
    String string_1, string_2;
    if (args.length == 0) {
      Scanner s = new Scanner(System.in);
      System.out.println();
      System.out.print("Enter String 1:");
      string_1 = s.nextLine();
      System.out.print("Enter String 2:");
      string_2 = s.nextLine();
      s.close(); // prompted in VS Code to close to free up resources
    } else {
      string_1 = args[0];
      string_2 = args[1];
    }
    String outputA, outputB, outputC, outputD;
    String outputE, outputF, outputG;

    // processing section

    // a) Length of String 1:
    outputA = String.valueOf(string_1.length());
    // b) Length of String 2:
    outputB = String.valueOf(string_2.length());
    // c) Concatenation:
    // outputC = string_1 + " " + string_2;
    outputC = string_1.concat(" ").concat(string_2);
    // d) Equal Strings?
    outputD = (string_1.equals(string_2)) ? "Equal" : "Not equal";
    // e) Uppercase String 1:
    outputE = string_1.toUpperCase();
    // f) Lowercase String 2:
    outputF = string_2.toLowerCase();
    // g) Valid substring:
    // my version... grab first 2 characters of the string if Length > 2
    outputG = (string_1.length() > 2 ? string_1.substring(0, 2) : "string length less than 2");

    // output section
    System.out.println("");
    System.out.println("a) Length of String 1:\t" + outputA);
    System.out.println("b) Length of String 2:\t" + outputB);
    System.out.println("c) Concatenation:\t" + outputC);
    System.out.println("d) Equal Strings?\t" + outputD);
    System.out.println("e) Uppercase String 1:\t" + outputE);
    System.out.println("f) Lowercase String 2:\t" + outputF);
    System.out.println("g) Valid substring:\t" + outputG);

    // cleanup section, any resources to close?
  }
}
