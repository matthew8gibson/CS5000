// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 11
// IDE Name: VS Code

import java.util.InputMismatchException;
import java.util.Scanner;

public class OutOfBoundException {
    public static void main(String[] args) {
        // setup
        Scanner scan = new Scanner(System.in);
        int arraySize = 10;
        int maxValueInArray = 100;
        int index, number;

        do { // start sentinel loop

            // BEGIN of primary function
            // populate my array
            int[] myArray = new int[arraySize];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = (int) (Math.random() * (maxValueInArray + 1));
                // System.out.println(myArray[i]);
            }
            // prompt
            System.out.print("Enter valid index between 0 and 9: ");
            while (true) { // the only way to exit the loop is to enter valid data.
                try {
                    index = scan.nextInt(); // could make InputMismatchException
                    number = myArray[index]; // could make IndexOutOfBoundsException
                    // no errors, so break out of prompting loop (not sentinel)
                    break;
                } catch (InputMismatchException ime) {
                    System.out.print("Index out of bound, re-enter a valid index: ");
                    scan.nextLine(); // Clear the buffer
                } catch (IndexOutOfBoundsException ioobe) {
                    System.out.print("Index out of bound, re-enter a valid index: ");
                    scan.nextLine(); // Clear the buffer
                } // end of catch
            } // end of while

            // results output
            System.out.println("The element at index " + index + " is " + number);
            // END of primary function
            System.out.println();
            System.out.print("Would you like to run program again (y/n)? ");
            String sentinelResponse = scan.next();
            if (!sentinelResponse.equalsIgnoreCase("y")) {
                break; // Exit the sentinel loop
            }
        } while (true);

        // cleanup
        scan.close();

    }
}