// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 12
// IDE Name: VS Code

import java.util.Scanner;

@SuppressWarnings("unused")

public class countAverageGrades {
    public static void main(String[] args) {
        // setup
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students in class:\t");
        int classSize = scan.nextInt();
        int[] grades = new int[classSize];
        scan.nextLine(); // clear buffer
        // System.out.println("Debug Class Size: " + classSize);

        System.out.print("Enter the grades:\t");
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scan.nextInt();
            // System.out.println(grades[i]);
        }

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

        // cleanup
        scan.close();

    }

    private static double findAverage(int[] arr, int index, int sum) {
        // the last time through
        if (index < 0) {
            return (double) sum / arr.length;
        }

        // start the adding of values to get the sum
        sum += arr[index];
        return findAverage(arr, index - 1, sum);
    }
}
