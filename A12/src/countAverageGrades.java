// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 12
// IDE Name: VS Code

import java.util.Scanner;
import java.util.InputMismatchException;

public class countAverageGrades {
    public static void main(String[] args) {
        // setup
        Scanner scan = new Scanner(System.in);
        int classSize;
        int[] grades;

        // setup sentinel
        String sentinelValue = "Y";
        String sentinelResponse = "Y";

        while (sentinelResponse.equals(sentinelValue)) {

            // section of code which will be optionally run multiple times - BEGIN

            // collecting input
            // getting class size
            classSize = 10000; // invalid value

            do {
                try {
                    System.out.print("Enter the number of students in class (25 max):\t");
                    classSize = scan.nextInt();
                    if ((classSize < 0) || (classSize > 25)) {
                        throw new IllegalArgumentException("Class Size must be between 1 and 25.");
                    }
                    break; // only gets here without an error
                } catch (InputMismatchException ime) {
                    System.out.println("Invalid Input. Enter an integer.");
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                } finally {
                    scan.nextLine(); // clear buffer
                    // System.out.println("Debug Class Size: " + classSize);
                }
            } while (true);

            do {
                // getting grades
                grades = new int[classSize];
                try {
                    System.out.print("Enter the grade for each student - " + classSize
                            + " of them. Grades must be betwee 1 to 100:\t");
                    for (int i = 0; i < grades.length; i++) {
                        grades[i] = scan.nextInt();
                        if (grades[i] < 0 || grades[i] > 100) {
                            throw new IllegalArgumentException("Grade must be between 1 and 100.");
                        }

                        // System.out.println("Debug grade: " + grades[i]);
                    }
                    break; // only gets here without an error
                } catch (InputMismatchException ime) {
                    System.out.println("Invalid Input. Enter an integer.");
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                } finally {
                    scan.nextLine(); // clear buffer
                }
            } while (true);

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

            // section of code which will be optionally run multiple times - END

            // sentinel checking
            System.out.print("Would you like to run program again (y/n)? ");
            sentinelResponse = scan.nextLine().toUpperCase().trim();

        }

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
