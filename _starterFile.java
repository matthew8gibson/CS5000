// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 9
// IDE Name: VS Code

import java.util.Scanner;

@SuppressWarnings("unused")

public class _starterFile {

      public static void main(String[] args) {
            System.out.println("Hello You!");
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

}