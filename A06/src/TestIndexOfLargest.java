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

    /*
     * { // first try
     * int[] testData = { 6, 5, 1, 2, 7, 3, 4 };
     * System.out.println(IndexOfLargest.findIndex(testData));
     * System.out.println();
     * }
     */

    // setup
    Scanner scan = new Scanner(System.in);

    String sentinelValue = "Y";
    String sentineResponse = "Y";

    while (sentineResponse.equals(sentinelValue)) {
      System.out.println();
      int[] enteredArray = new int[10];
      System.out.print("Enter 10 integers:");
      for (int i = 0; i < 10; i++) {
        enteredArray[i] = scan.nextInt();
      }
      System.out.println();
      System.out.print("You entered these values:\t");
      for (int i = 0; i < enteredArray.length; i++) {
        System.out.print(enteredArray[i] + " ");
      }
      System.out.println();
      System.out.println("Index of largest value:\t\t" + IndexOfLargest.findIndex(enteredArray));
      System.out.println();
      scan.nextLine(); // clear the thing caused by .nextInt()
      System.out.print("Do you want to do it again? (Y to continue): ");
      sentineResponse = scan.nextLine().toUpperCase().trim();
    }
    scan.close();
  }
}