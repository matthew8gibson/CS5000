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
      public double[] averageRatingsPerHotel; // TODO : return this to private

      HotelRating() {
            // default constructor.
            numberOfHotels = 3;
            numberOfYears = 5;

            ratings = new int[numberOfHotels][numberOfYears];
            averageRatingsPerHotel = new double[numberOfHotels];
            generateRatingsArray(numberOfHotels, numberOfYears, ratings);

      }

      HotelRating(int hotels, int years) {
            numberOfHotels = hotels;
            numberOfYears = years;

            ratings = new int[numberOfHotels][numberOfYears];
            averageRatingsPerHotel = new double[numberOfHotels];
            generateRatingsArray(numberOfHotels, numberOfYears, ratings);

      }

      public int[] fiveStarsHotels() {
            // to return an array of the indices (index values) of hotels that have earned
            // five stars at least once over the years.

            int[] output = new int[ratings.length]; // sizing to allow for all hotels to be 5 star
            int countOfFiveStars = 0;
            for (int i = 0; i < numberOfHotels; i++) {
                  for (int j = 0; j < numberOfYears; j++) {
                        if (ratings[i][j] == 5) {
                              // add to array and break out of this for loop.
                              output[countOfFiveStars] = i; // store the index of the array (number of the hotel)
                              countOfFiveStars = countOfFiveStars + 1;
                              break; // once we find a 5 star rating for a hotel, no need to check further
                        } // end of action to take when 5 star
                  } // end of looping through years
            } /// end of looping through hotels.

            // resize the array to only be as long as necessary
            int[] resizedOutput = new int[countOfFiveStars];
            for (int i = 0; i < countOfFiveStars; i++) {
                  resizedOutput[i] = output[i];
            }

            return resizedOutput;

      }

      public void averageRatings() {
            // to printout the average rating (double) for each hotel over the years.
            double average;
            int total;
            System.out.println("Average Ratings are:");
            for (int i = 0; i < numberOfHotels; i++) {
                  // reset for each hotel
                  average = 0;
                  total = 0;
                  System.out.printf("\tHotel %d:\t\t\t", i);
                  for (int j = 0; j < numberOfYears; j++) {
                        total = total + ratings[i][j];
                  }
                  average = (double) total / numberOfYears;

                  System.out.printf("%.2f\n", average); // showing the average
            }

      }

      public void fourOrMoreStars() {
            // to printout the indices (index values) of hotels that have earned four or
            // more starts at least once.
            System.out.print("Four or more stars hotels indices:\t");
            int hotelCounter = 0;
            for (int i = 0; i < numberOfHotels; i++) {
                  for (int j = 0; j < numberOfYears; j++) {
                        if (ratings[i][j] >= 4) {

                              if (hotelCounter > 0) {
                                    System.out.print(", ");
                              }
                              System.out.print(i); // index
                              hotelCounter = hotelCounter + 1;
                              break;
                        } // end of 'found a 4 or above'
                  } // end of loop of years
            } // end of loop of hotels
            System.out.print("\n");

      }

      public Boolean anyFiveStars() {
            // anyFiveStars() to return true if at least one hotel earned five stars for at
            // least one year;false otherwise.
            if (fiveStarsHotels().length > 0) {
                  return true;
            }
            return false;
      }

      public int bestHotel() {
            // bestHotel() to return the index for the best quality hotel over the years. If
            // more than one hotel, return the index of the first hotel in the array.
            int best = 0; // start with the first is the best
            for (int i = 0; i < averageRatingsPerHotel.length; i++) {
                  if (averageRatingsPerHotel[best] < averageRatingsPerHotel[i]) {
                        best = i; // if bigger replace.
                  } // else leave as-is.
            }
            return best;
      }

      public int worstHotel() {
            // worstHotel() to return the index for the worst quality hotel over the years.
            // If more than one hotel, return the index of the first hotel in the array.
            int worst = 0; // start with the first is the worst
            for (int i = 0; i < averageRatingsPerHotel.length; i++) {
                  if (averageRatingsPerHotel[worst] > averageRatingsPerHotel[i]) {
                        worst = i; // if smaller replace.
                  } // else leave as-is.
            }
            return worst;
      }

      // public void printChart(int[][] ratings) {
      public void printChart() {
            // printChart() to printout the ratings for all hotels as shown below (for
            // illustration, assume we have 3 hotels and 4 years of ratings):

            // setup
            String graphicString = "*";
            String lineString = "-";

            // title
            System.out.println("Ratings chart:");
            System.out.println();

            // table header
            System.out.print("\t\t\t"); // prefix space
            // loop through years
            for (int i = 0; i < numberOfYears; i++) {
                  System.out.printf("Year%d\t", i + 1);
            }
            System.out.printf("\n"); // end of line of year header
            System.out.print("\t" + lineString.repeat(15 + (numberOfYears * 8)));
            System.out.println();

            // body
            // System.out.println("body");
            // for each hotel do a row.
            for (int i = 0; i < numberOfHotels; i++) {
                  // column 1
                  System.out.printf("\tHotel %d\t\t", i);
                  // column 2 to X
                  // for each year do a column
                  for (int j = 0; j < numberOfYears; j++) {
                        // System.out.print(ratings[i][j] + "\t"); // this does numbers
                        System.out.print(graphicString.repeat(ratings[i][j]) + "\t"); // this does #'s of a String
                  }
                  System.out.printf("\n"); // end of line for each row
            } // end of loop for ratings

            // footer
            System.out.println();
            // System.out.println("footer");
      }

      private int[][] generateRatingsArray(int numberOfHotels, int numberOfYears, int[][] hotelRatings) {
            // using function to populate the arry with rating values
            // note: also storing average in another array
            int total;
            for (int i = 0; i < numberOfHotels; i++) {
                  total = 0;
                  for (int j = 0; j < numberOfYears; j++) {
                        hotelRatings[i][j] = generateSingleRating();
                        total = total + hotelRatings[i][j];
                  }
                  averageRatingsPerHotel[i] = (double) total / numberOfHotels;
            }

            return hotelRatings;
      }

      private int generateSingleRating() {
            // generating integer between LOWEST_POSSIBLE_SCORE and HIGHEST_POSSIBLE_SCORE
            return (int) ((Math.random() * (HIGHEST_POSSIBLE_SCORE - LOWEST_POSSIBLE_SCORE + 1)
                        + LOWEST_POSSIBLE_SCORE));
      }

      /*
       * private void generateAverageRatingsPerHotel() {
       * int total;
       * // create an arry to be used for find the best/worst hotels
       * for (int i = 0; i < ratings[0].length; i++) {
       * total = 0;
       * for (int j = 0; j < ratings[i].length; j++) {
       * total = total + ratings[i][j];
       * }
       * averageRatingsPerHotel[i] = (double) total / ratings[1].length;
       * }
       * 
       * }
       */

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