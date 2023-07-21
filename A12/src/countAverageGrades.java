// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 12
// IDE Name: VS Code

import java.util.Scanner;
import java.util.InputMismatchException;
//import java.util.IllegalArgumentException;

//@SuppressWarnings("unused")

public class countAverageGrades {
    public static void main(String[] args) {
        // setup
        Scanner scan = new Scanner(System.in);
        int classSize = 10000;

        // collecting input
        // getting class size
        try {
            System.out.print("Enter the number of students in class (25 max):\t");
            classSize = scan.nextInt();
            if ((classSize < 0) || (classSize > 25)) {
                throw new IllegalArgumentException("Class Size must be between 1 and 25.");
            }
        } catch (InputMismatchException ime) {
            System.out.println("Invalid Input. Enter an integer.");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } finally {
            scan.nextLine(); // clear buffer
            // System.out.println("Debug Class Size: " + classSize);
        }

        // getting grades
        int[] grades = new int[classSize];
        try {
            System.out.print("Enter the grades (1 to 100):\t");
            for (int i = 0; i < grades.length; i++) {
                grades[i] = scan.nextInt();
                if (grades[i] < 0 || grades[i] > 100) {
                    throw new IllegalArgumentException("Grade must be between 1 and 100.");
                }
                // System.out.println("Debug grade: " + grades[i]);
            }
        } catch (InputMismatchException ime) {
            System.out.println("Invalid Input. Enter an integer.");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } finally {
            scan.nextLine(); // clear buffer
        }
        // end collecting input

        // calculations
        // sending the array of grades
        // and the size to use
        // and start the sum at 0
        double average = findAverage(grades, classSize - 1, 0);

        // output
        System.out.println("Class size:\t" + classSize);
        System.out.print("Entered grades:\t");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.print("\n");
        System.out.printf("Class average:\t%.2f\n", average);
        // end output

        // cleanup
        scan.close();
    }

    private static double findAverage(int[] workingArray, int index, int sum) {
        // the last time through
        if (index < 0) {
            return (double) sum / workingArray.length;
        }

        // start the adding of values to get the sum
        sum += workingArray[index];
        return findAverage(workingArray, index - 1, sum);
    }
}
