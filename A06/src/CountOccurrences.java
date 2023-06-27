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

    // now give the output but not 0's
    for (int i = 1; i < countOfEachNumber.length; i++) {
      if (countOfEachNumber[i] > 0) {
        String sIfPlural = (countOfEachNumber[i] == 1) ? "" : "s";
        System.out.printf("%d occurred\t %d time%s\n", i, countOfEachNumber[i],
            sIfPlural);
      }

    }

    // conditional
  }
}