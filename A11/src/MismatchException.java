// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 11
// IDE Name: VS Code

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("unused")

public class MismatchException {

      public static void main(String[] args) {
            // setup
            Scanner scan = new Scanner(System.in);
            int[] input = new int[4];
            double average = 0.0;
            int sum = 0;

            // prompt
            System.out.print("Enter four grades between 0 and 100: ");
            while (true) {
                  try {
                        for (int i = 0; i < input.length; i++) {
                              input[i] = scan.nextInt();
                        }
                        for (int i = 0; i < input.length; i++) {
                              if (input[i] >= 0 && input[i] <= 100) {
                                    // valid input
                              } else {
                                    throw new IllegalArgumentException("Number is out of range 1 to 100.");
                              }
                        }
                        break; // valid input so exit the while loop.
                  } catch (InputMismatchException | IllegalArgumentException e) {
                        // error response
                        System.out.print("Incorrect input, re-enter valid grades: ");
                        scan.nextLine(); // clear buffer
                  }
            }

            // calculate the average
            for (int i = 0; i < input.length; i++) {
                  sum = sum + input[i];
            }
            average = (double) sum / input.length;

            // output
            System.out.print("Entered grades are:\t");
            for (int i = 0; i < input.length; i++) {
                  System.out.print(input[i]);
                  // add comma and space after each number, except last
                  if (i < (input.length - 1)) {
                        System.out.print(", ");
                  }
            }
            System.out.print("\n"); // adding the space

            System.out.printf("Student Average:\t%.2f", average);

            // cleanup
            scan.close();
      }
}
