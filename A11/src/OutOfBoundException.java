// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 11
// IDE Name: VS Code

import java.util.Scanner;
import java.util.InputMismatchException;

public class OutOfBoundException {
    public static void main(String[] args) {

        // setup
        Scanner scan = new Scanner(System.in);
        int input = -1;
        Boolean isValidInput = false;
        int arraySize = 10;
        int maxValueInArray = 100;
        int value = -1;

        // setup sentinel
        // Scanner scan = new Scanner(System.in);
        String sentinelValue = "Y";
        String sentinelResponse = "Y";

        while (sentinelResponse.equals(sentinelValue)) {

            // section of code which will be optionally run multiple times - BEGIN
            // populate my array
            int[] myArray = new int[arraySize];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = (int) (Math.random() * (maxValueInArray + 1));
                // System.out.println(myArray[i]);
            }
            System.out.println("Debug: " + scan.hasNext() + " line36");

            System.out.print("Enter valid index between 0 and 9: ");

            // this while loop requires an exception to be raised on both entering the data
            // and checking the array index location
            while (!isValidInput) {
                // problems to catch with user data entry:
                // 1. user enters something which is not an integer
                // 2. user enters an integer is which not between (zero and (arraySize - 1))

                // collecting user data
                try {
                    input = scan.nextInt(); // could generate InputMismatchException (problem 1)
                    value = myArray[input]; // could generate IndexOutOfBoundsException (problem 2)
                    // this code won't run, if an error is thrown!
                    // so if it runs, the input is valid
                    isValidInput = true;
                } catch (InputMismatchException ime) {
                    // one of the 2 problems got caught here
                    scan.nextLine(); // clear buffer
                    System.out.print("Index out of bound, re-enter a valid index: ");
                } catch (IndexOutOfBoundsException ioobe) {
                    // one of the 2 problems got caught here
                    scan.nextLine(); // clear buffer
                    System.out.print("Index out of bound, re-enter a valid index: ");

                }
                scan.nextLine(); // clear buffer (this is not needed in this location, but seems like a good idea
                                 // to do it incase more prompts are added later)
            }

            System.out.printf("The element at index %d is %d\n", input, value);

            // section of code which will be optionally run multiple times - END

            // sentinel checking
            System.out.print("Would you like to run program again (y/n)? ");
            sentinelResponse = scan.nextLine().toUpperCase().trim();

        }

        // cleanup
        scan.close();
    }
}
