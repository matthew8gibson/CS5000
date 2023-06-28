// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  6
// IDE Name:    VS Code

import java.util.Scanner;

/**
 * TestIndexOfLargest
 */
public class TestIndexOfLargest {

  public static void main(String[] args) {

    // setup
    Scanner scan = new Scanner(System.in);
    String sentinelValue = "Y";
    String sentinelResponse = "Y";

    while (sentinelResponse.equals(sentinelValue)) {
      // getting input from user
      System.out.println();
      int[] enteredArray = new int[10];
      System.out.print("Enter 10 integers:\t");
      for (int i = 0; i < 10; i++) {
        enteredArray[i] = scan.nextInt();
      }

      // ouput
      System.out.println();
      System.out.print("You entered these values:\t");
      for (int i = 0; i < enteredArray.length; i++) {
        System.out.print(enteredArray[i] + " ");
      }
      System.out.println();
      System.out.println("Index of largest value:\t\t" + IndexOfLargest.findIndex(enteredArray));
      System.out.println();

      // sentinel checking
      scan.nextLine(); // clear the thing caused by .nextInt()
      System.out.print("Do you want to do it again? (Y to continue): ");
      sentinelResponse = scan.nextLine().toUpperCase().trim();
    }
    scan.close();
  }
}