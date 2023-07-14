// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 9
// IDE Name: VS Code

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TestHotelRating {

      public static void main(String[] args) {

            // setup
            Scanner scan = new Scanner(System.in);
            int numberOfYears, numberOfHotels;

            // setup sentinel
            // Scanner scan = new Scanner(System.in);
            String sentinelValue = "Y";
            String sentinelResponse = "Y";

            while (sentinelResponse.equals(sentinelValue)) {

                  // section of code which will be optionally run multiple times - BEGIN
                  // BEGIN OF one session ==============
                  // Allow the user to enter number of years and number of hotels. Do not
                  // hard-code the array size.
                  numberOfHotels = gatherPositiveInt("How many hotels?\t");
                  numberOfYears = gatherPositiveInt("How many years?\t\t");

                  // create object
                  HotelRating myHotelRating = new HotelRating(numberOfHotels, numberOfYears);

                  // generate output
                  // item 2
                  System.out.print("Five stars hotels indices:\t\t");
                  // handling blank array
                  if (myHotelRating.fiveStarsHotels().length == 0) {
                        System.out.print("none");
                  } else {
                        // array has contents
                        // conditionally adding commas
                        int count = 0;
                        for (int i = 0; i < myHotelRating.fiveStarsHotels().length; i++) {
                              if (count > 0) {
                                    System.out.print(", ");
                              }
                              System.out.print(myHotelRating.fiveStarsHotels()[i]);
                              count = count + 1;
                        } /// end of array
                  }
                  System.out.print("\n"); // return carraige after list of five star hotels.

                  // item 2, 3, 4, 5, and 6,
                  myHotelRating.averageRatings();
                  myHotelRating.fourOrMoreStars();
                  System.out.printf("Any five stars hotel?\t\t\t" + myHotelRating.anyFiveStars().toString() + "\n");
                  System.out.println("Best hotel index:\t\t\t" + myHotelRating.bestHotel());
                  System.out.println("Worst hotel index:\t\t\t" + myHotelRating.worstHotel());

                  // item 7
                  myHotelRating.printChart();

                  // END OF one session ==============
                  // section of code which will be optionally run multiple times - END

                  // sentinel checking
                  System.out.print("Would you like to run program again (y/n)? ");
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

            // return the value
            return gatheredValue;
      }

}