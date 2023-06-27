// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  6
// IDE Name:    VS Code

/**
 * CountOccurrences
 */
import java.util.Scanner;

public class CountOccurrences {

  public static void main(String[] args) {
    // setup
    Scanner scan = new Scanner(System.in);
    int sentinelValueInner = 0;
    String sentinelValueOuter = "Y";
    Boolean debug = false;

    // outer while loop, which controls the question to continue.
    while (sentinelValueOuter.equals("Y")) {
      // inner while loop setup
      int count = 0;
      int[] arrayEntered = new int[10];
      System.out.print("Enter up to 10 integers between 1 and 100 (0 to stop):");
      while (true) { // inner while loop (collecting the integers)
        int numberEntered = scan.nextInt();
        if (numberEntered == sentinelValueInner) {
          break; // exits the inner loop, but not the outer
        } else {
          // do stuff
        }
        if (numberEntered >= 1 && numberEntered <= 100) {
          // count it!
          arrayEntered[count] = numberEntered;
          count++;
        } // if not true, then we don't count it!1
      } // end of inner loop
      if (debug) {
        System.out.println("array:");
        for (int i = 0; i < arrayEntered.length; i++) {
          System.out.println("Place " + i + " is: " + arrayEntered[i]);
        }
      }
      Count(arrayEntered);
      // send the data to be processed and printed

      scan.nextLine(); // clear the input buffer
      System.out.print("Do you want to continue? (Y to continue):\t");
      sentinelValueOuter = scan.nextLine().toUpperCase().trim();
    } // end of outter loop

    // cleanup
    scan.close();
  }

  public static void Count(int[] inputArray) {
    // create an array the size of all possible values to store each count.
    int[] countOfEachNumber = new int[101];

    // this captures all the default 0's in the array
    // but that's ok b/c that's an invalid number
    // and thus excluded from the output
    for (int i = 0; i < inputArray.length; i++) {
      countOfEachNumber[inputArray[i]]++; // counts them into the array
    }
    Boolean debug = false;
    if (debug) {
      System.out.println("countOfEachNumber:");
      for (int i = 0; i < countOfEachNumber.length; i++) {
        System.out.println("Place " + i + " is: " + countOfEachNumber[i]);
      }
    }

    // Looping through the countOfEachNumber
    // problem is this sorts the output from lowest to hightest.
    /*
     * for (int i = 1; i < countOfEachNumber.length; i++) {
     * if (countOfEachNumber[i] > 0) {
     * String sIfPlural = (countOfEachNumber[i] == 1) ? "" : "s";
     * System.out.printf("%d occurred\t %d time%s\n", i, countOfEachNumber[i],
     * sIfPlural);
     * }
     * }
     */

    // create a new array of all the values in the other they were entered
    // loop through existing array.
    // Add new items only if not equal 0 and not already in there.

    int[] outputArray = new int[100];
    int k = 0; // current location in outputArray
    for (int i = 0; i < inputArray.length; i++) {
      // System.out.println("working: " + inputArray[0]);
      if (containsNumber(outputArray, inputArray[i])) {
        // nothing to do if it already contains.
      } else {
        // System.out.print("asdf");
        outputArray[k] = inputArray[i]; // do this when not found already
        k++; // setup the next spot for a number to go
      }
    } // end of for loop

    /*
     * debug = true;
     * if (debug) {
     * for (int i = 0; i < outputArray.length; i++) {
     * System.out.println("confirm output array");
     * if (outputArray[i] != 0) {
     * System.out.print(outputArray[i]);
     * }
     * }
     * }
     */

    /*
     * System.out.println(outputArray.length);
     * System.out.println(outputArray[0]);
     * System.out.println(outputArray[1]);
     * System.out.println(outputArray[2]);
     */
    // outputArray is populated with the values entered in order no dups
    for (int i = 0; i < outputArray.length; i++) {

      if (outputArray[i] > 0) {
        // System.out.println("debug: " + outputArray[i]);
        String sIfPlural = (countOfEachNumber[outputArray[i]] == 1) ? "" : "s";
        System.out.printf("%d occurred\t %d time%s\n", outputArray[i],
            countOfEachNumber[outputArray[i]],
            sIfPlural);
      }

    }
  }

  public static boolean containsNumber(int[] array, int number) {
    for (int element : array) {
      if (element == number) {
        return true; // found it!
      }
    }
    return false;
  }
}
