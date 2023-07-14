// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 9
// IDE Name: VS Code

import java.util.Scanner;

@SuppressWarnings("unused")

public class TestHotelRating {

      public static void main(String[] args) {

            // setup
            Scanner scan = new Scanner(System.in);
            int numberOfYears, numberOfHotels;

            System.out.println("Hello You!");

            // Allow the user to enter number of years and number of hotels. Do not
            // hard-code the array size.
            numberOfHotels = gatherPositiveInt("How many hotels?\t");
            // System.out.println(numberOfHotels);
            numberOfYears = gatherPositiveInt("How many years?\t");
            // System.out.println(numberOfYears);

            // create object
            HotelRating myHotelRating = new HotelRating(numberOfHotels, numberOfYears);
            myHotelRating.printChart();

            // cleanup
            scan.close();

      }

      private static void sentinelSnippet() {

            // setup sentinel
            Scanner scan = new Scanner(System.in);
            String sentinelValue = "Y";
            String sentinelResponse = "Y";

            while (sentinelResponse.equals(sentinelValue)) {

                  // section of code which will be optionally run multiple times - BEGIN

                  // section of code which will be optionally run multiple times - END

                  // sentinel checking
                  System.out.print("Do you want to do it again? (Y to continue): ");
                  sentinelResponse = scan.nextLine().toUpperCase().trim();

            }

            // cleanup
            scan.close();
      }

      private static Boolean CheckPositive(double balance) {
            if (balance > 0) {
                  return true;

            }
            return false;
      }

      private static int gatherPositiveInt(String message) {
            Scanner scanner = new Scanner(System.in);
            int gatheredValue = 0;
            do {
                  System.out.print(message);
                  gatheredValue = scanner.nextInt();
                  scanner.nextLine(); // clear the line return
                  if (!CheckPositive(gatheredValue)) {
                        System.out.println("The value must be positive.");
                  }
            } while (!CheckPositive(gatheredValue));

            // cleanup
            // scanner.close();
            // if i close this the second time I call it seems as if the Scanner object
            // isn't there.

            // return the value
            return gatheredValue;
      }

}