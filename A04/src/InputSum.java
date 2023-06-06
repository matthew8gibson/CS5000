
// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  4
// IDE Name:    VS Code

import java.util.Scanner;

public class InputSum {

  public static void main(String[] args) {

    {
      // setup section
      int sum = 0, value, count = 0;
      Scanner scan = new Scanner(System.in);

      // Processing and taking input
      System.out.print("Enter positive integers (-1 to quit): ");
      value = scan.nextInt();
      while (value != -1)
      // sentinel value of -1 to terminate loop
      {
        if (value > 0) { // not counting negative numbers

          sum = sum + value;
        } else {
          System.out.println("The sum so far is " + sum);
          System.out.print("Enter positive integers (-1 to quit): ");
          value = scan.nextInt();
        }
      }

      // output section
      System.out.println();
      if (count == 0) {
        System.out.println("No values were entered.");
      } else {
        System.out.println("Sum of all values = " + sum + "\n" + "Average of all values = " + (sum / (double) count));
      }

      // cleanup
      scan.close(); // cleaning up resources
    }

  }
}
