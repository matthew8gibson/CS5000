// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  4
// IDE Name:    VS Code

import java.util.Scanner;

public class InputSum {
  public static void main(String[] args) {
    // program used variables
    int sum;
    String promptMessage = "Enter positive integers (-1 to quit):\t";
    String outerLoopPromptMessage = "Do you want to keep going? (y):\t";
    String outerLoopSentinelValue = "Y";

    // user input values
    int value = 0;
    String enteredNumbers = "";
    String outerLoopsEnteredValue = "Y";

    // system objects to use to get user input
    Scanner scan = new Scanner(System.in);
    Scanner scanOutter = new Scanner(System.in);

    // outer loop, designed to prompt for Y to keep going.
    while (outerLoopsEnteredValue.equalsIgnoreCase(outerLoopSentinelValue)) {
      // inner application, core funtionality of InputSum
      // prompt for Numbers
      System.out.println();
      System.out.print(promptMessage);
      value = scan.nextInt();
      // // System.out.println("Debugging: first value:\t" + value);
      sum = 0;
      enteredNumbers = "";

      while (value != -1) {
        if (value > 0) { // only counting postive numbers.
          sum = sum + value;
          if (enteredNumbers.length() > 0) {
            // only adding the comma and space after the first run.
            enteredNumbers = enteredNumbers + ", ";
          }
          enteredNumbers = enteredNumbers.concat(String.valueOf(value));
          // System.out.println("Debugging: Entered Numbers:\t" + enteredNumbers);
          // System.out.println("Debugging: The sum so far is:\t" + sum);
        }
        value = scan.nextInt();
      }
      // output section
      System.out.println();
      System.out.println("Entered Numbers:\t" + enteredNumbers);
      System.out.println("The Sum:\t\t" + sum);

      // outer loop prompt
      System.out.println();
      System.out.print(outerLoopPromptMessage);
      outerLoopsEnteredValue = scanOutter.nextLine();
    }
    // close out resources.
    scan.close();
    scanOutter.close();
  }
}
