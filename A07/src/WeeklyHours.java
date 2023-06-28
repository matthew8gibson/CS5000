// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  7
// IDE Name:    VS Code

public class WeeklyHours {

  public static void main(String[] args) {

    int numberOfEmployees = 3;
    int daysOfTheWeek = 7;
    int[][] arrayHoursWorked = new int[numberOfEmployees][daysOfTheWeek];

    // populates the array with random numbers between 0 and 10
    for (int i = 0; i < numberOfEmployees; i++) {
      for (int j = 0; j < daysOfTheWeek; j++) {
        arrayHoursWorked[i][j] = GenerateDailyHours();
      }
    }
    // print the arry as a table
    // header
    System.out.println();
    System.out.println("\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun");

    // table body
    for (int i = 0; i < numberOfEmployees; i++) {
      System.out.printf("Employee%d\t ", i + 1);
      for (int j = 0; j < daysOfTheWeek; j++) {
        System.out.print(arrayHoursWorked[i][j] + "\t ");
      }
      System.out.println();
    }

  }

  public static int GenerateDailyHours() {
    // The main method populates the array with random numbers between 0 and 10
    return (int) ((Math.random() * 10) + 1);

  }

}