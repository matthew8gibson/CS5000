// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 9
// IDE Name: VS Code

import java.util.Scanner;

@SuppressWarnings("unused")

public class HotelRating {

      private int numberOfHotels;
      private int numberOfYears;
      final private int LOWEST_POSSIBLE_SCORE = 1;
      final private int HIGHEST_POSSIBLE_SCORE = 5;
      private int[][] ratings;

      HotelRating() {
            // default constructor.
            numberOfHotels = 3;
            numberOfYears = 5;
            ratings = new int[numberOfHotels][numberOfYears];
      }

      HotelRating(int hotels, int years) {
            numberOfHotels = hotels;
            numberOfYears = years;
            ratings = new int[numberOfHotels][numberOfYears];
            generateRatingsArray(numberOfHotels, numberOfYears, ratings); // populates ratings?
            // printChart(ratings);
      }

      public int[] fiveStarsHotels() {
            // to return an array of the indices (index values) of hotels that have earned
            // five stars at least once over the years.
            return new int[3];

      }

      private int[][] averageRatings() {
            // to printout the average rating (double) for each hotel over the years.
            return new int[2][3];
      }

      public Boolean anyFiveStars() {
            // anyFiveStars() to return true if at least one hotel earned five stars for at
            // least one year;false otherwise.

            return false;
      }

      public int bestHotel() {
            // bestHotel() to return the index for the best quality hotel over the years. If
            // more than one hotel, return the index of the first hotel in the array.
            return 0;
      }

      public int worstHotel() {
            // worstHotel() to return the index for the worst quality hotel over the years.
            // If more than one hotel, return the index of the first hotel in the array.
            return 0;
      }

      // public void printChart(int[][] ratings) {
      public void printChart() {
            // printChart() to printout the ratings for all hotels as shown below (for
            // illustration, assume we have 3 hotels and 4 years of ratings):

            // header
            System.out.println();
            // System.out.println("header");
            System.out.print("\t\t"); // prefix space
            // loop through years
            for (int i = 0; i < ratings[1].length; i++) {
                  System.out.printf("Year%d\t", i + 1);
            }
            System.out.printf("\n"); // end of line of year header

            // body
            System.out.println("body");
            // for each hotel do a row.
            for (int i = 0; i < ratings.length; i++) {
                  // column 1
                  System.out.printf("Hotel %d\t\t", i);
                  // column 2 to X
                  // for each year do a column
                  for (int j = 0; j < ratings[1].length; j++) {
                        System.out.print(ratings[i][j] + "\t");
                  }
                  System.out.printf("\n"); // end of line for each row
            } // end of loop for ratings

            // footer
            System.out.println("footer");
      }

      private int[][] generateRatingsArray(int numberOfHotels, int numberOfYears, int[][] hotelRatings) {

            // move the creation and sizing to constructor
            // int[][] hotelRatings = new int[numberOfHotels][numberOfYears];
            for (int i = 0; i < numberOfHotels; i++) {
                  for (int j = 0; j < numberOfYears; j++) {
                        hotelRatings[i][j] = generateSingleRating();
                  }
            }

            return hotelRatings;
      }

      private int generateSingleRating() {
            // generating integer between LOWEST_POSSIBLE_SCORE and HIGHEST_POSSIBLE_SCORE
            return (int) ((Math.random() * (HIGHEST_POSSIBLE_SCORE - LOWEST_POSSIBLE_SCORE + 1)
                        + LOWEST_POSSIBLE_SCORE));
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
                  System.out.print("Would you like to run program again (y/n)? ");
                  sentinelResponse = scan.nextLine().toUpperCase().trim();

            }

            // cleanup
            scan.close();
      }

}