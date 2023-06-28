// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  6
// IDE Name:    VS Code

import java.util.Scanner;

public class CountOccurrences {

  public static void main(String[] args) {
    // setup
    Scanner scan = new Scanner(System.in);
    int sentinelValueInner = 0;
    String sentinelValueOuter = "Y";
    int countOfIntegersToAccept = 10;

    System.out.println();
    // outer while loop, which controls the question to continue.
    while (sentinelValueOuter.equals("Y")) {
      // inner while loop setup
      int count = 0;
      int[] arrayEntered = new int[countOfIntegersToAccept];
      System.out.print("Enter up to 10 integers between 1 and 100 (0 to stop):\t");
      while (true) { // inner while loop (collecting the integers)
        int numberEntered = scan.nextInt();
        if (numberEntered == sentinelValueInner) {
          break; // exits the inner loop, but not the outer
        }
        if (numberEntered >= 1 && numberEntered <= 100) {
          arrayEntered[count] = numberEntered; // record it it!
          count++;
        } // if not true, then we don't record it
      } // end of inner loop
      Boolean debug = false;
      if (debug) {
        System.out.println("array:");
        for (int i = 0; i < arrayEntered.length; i++) {
          System.out.println("Place " + i + " is: " + arrayEntered[i]);
        }
      }
      Count(arrayEntered); // send the data to be processed and printed

      scan.nextLine(); // clear the input buffer
      System.out.print("Do you want to continue? (Y to continue):\t");
      sentinelValueOuter = scan.nextLine().toUpperCase().trim();
      System.out.println();
    } // end of outter loop

    // cleanup
    scan.close();
  }

  public static void Count(int[] inputArray) {

    // Counting the values
    // create an array the size of all possible values to store each count.
    int[] countOfEachNumber = new int[101];
    // this process captures all the default 0's in the array
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

    // creating an arry of values to output
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
    // outputArray is populated with the values entered in order no dups

    // printing the report for the user
    // uses outputArray to provide the list of numbers
    // then, uses the countOfEachNumber to populate "X" times
    System.out.println();
    for (int i = 0; i < outputArray.length; i++) {
      if (outputArray[i] > 0) {
        // System.out.println("debug: " + outputArray[i]);
        String sIfPlural = (countOfEachNumber[outputArray[i]] == 1) ? "" : "s";
        System.out.printf("%d occurred\t %d time%s\n", outputArray[i],
            countOfEachNumber[outputArray[i]],
            sIfPlural);
      }
    }
    System.out.println(); // spacing at end of report before Sentinel Prompt
  }

  public static boolean containsNumber(int[] array, int number) {
    for (int element : array) {
      if (element == number) {
        return true; // found it!
      }
    }
    return false;// not in there.
  }
}
