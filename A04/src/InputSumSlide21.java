// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  4
// IDE Name:    VS Code

import java.util.Scanner;

// this one is modeled on Slide 21

public class InputSumSlide21 {
  public static void main(String[] args) {
    // setup section
    int sum = 0, value;
    String enteredNumbers = "";
    String promptMessage = "Enter positive integers (-1 to quit):\t";
    Scanner scan = new Scanner(System.in);

    // first prompt
    System.out.print(promptMessage);
    value = scan.nextInt();

    // loop of prompts
    while (value != -1) // sentinel value of -1 to terminate loop
    {
      if (value > 0) { // only counting postive numbers.
        sum = sum + value;
        if (enteredNumbers.length() > 0) {
          // only adding the comma and space after the first run.
          enteredNumbers = enteredNumbers + ", ";
        }
        enteredNumbers = enteredNumbers + String.valueOf(value);
        // System.out.println("Debugging: Entered Numbers:\t" + enteredNumbers);
        // System.out.println("Debugging: The sum so far is:\t" + sum);
      }
      System.out.print(promptMessage);
      value = scan.nextInt();
    }

    // output section
    System.out.println();
    System.out.println("Entered Numbers:\t" + enteredNumbers);
    System.out.println("The Sum:\t\t" + sum);

    // resource cleanup
    scan.close();
  }
}
