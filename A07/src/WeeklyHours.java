// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  7
// IDE Name:    VS Code

import java.util.Scanner;

public class WeeklyHours {

  public static void main(String[] args) {

    // sentinel setup
    Scanner scan = new Scanner(System.in);
    String sentinelValue = "Y";
    String sentinelResponse = "Y";

    // main setup
    int numberOfEmployees = 3;
    int daysOfTheWeek = 7;
    int[][] arrayHoursWorked = new int[numberOfEmployees][daysOfTheWeek];

    while (sentinelResponse.equals(sentinelValue)) {
      // populates the array with daily hours
      for (int i = 0; i < numberOfEmployees; i++) {
        for (int j = 0; j < daysOfTheWeek; j++) {
          arrayHoursWorked[i][j] = GenerateDailyHours();
        }
      }

      // print the table header
      System.out.println();
      System.out.println("\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun");

      // print the table body
      for (int i = 0; i < numberOfEmployees; i++) {
        System.out.printf("Employee%d\t ", i + 1); // first column
        for (int j = 0; j < daysOfTheWeek; j++) {
          System.out.print(arrayHoursWorked[i][j] + "\t "); // other columns
        }
        System.out.println(); // space after the table to make it less cluttered
      }

      // call function to summarize hours per employee
      addHours(arrayHoursWorked);

      // sentinel input section
      System.out.println();
      // scan.nextLine(); // clear the thing caused by .nextInt()
      System.out.print("Do you want to do it again? (Y to continue): ");
      sentinelResponse = scan.nextLine().toUpperCase().trim();
    } // end of sentinel loop

    // cleanup
    scan.close();

  }

  public static int GenerateDailyHours() {
    // generates random numbers between 0 and 10
    return (int) ((Math.random() * 11));
  }

  public static void addHours(int[][] inputArray) {
    // create table to summarize Weekly Hours per employee
    int[][] weeklyHoursPerEmployee = new int[3][2];

    // populating the table to summarize weekly hours per employee
    for (int i = 0; i < inputArray.length; i++) {
      // summarize here per employee
      weeklyHoursPerEmployee[i][0] = i; // populating employee ID
      int employeesWeeklyHours = 0;
      for (int j = 0; j < inputArray[i].length; j++) {
        employeesWeeklyHours = employeesWeeklyHours + inputArray[i][j];
      } // end of looping through an week of work
      weeklyHoursPerEmployee[i][1] = employeesWeeklyHours; // populating total hours worked
    } // end of looping through an employee

    // table header
    System.out.println();
    System.out.printf("%12s \t %12s%n", "Employee#", "Weekly Hours");
    System.out.println("----------------------------------");

    // table body
    for (int[] employeeRow : weeklyHoursPerEmployee) {
      System.out.printf("%7d \t %6d%n", employeeRow[0] + 1, employeeRow[1]);
    }
  }
}