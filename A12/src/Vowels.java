// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 12
// IDE Name: VS Code

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        // setup
        Scanner scan = new Scanner(System.in);
        String input;

        // setup sentinel
        String sentinelValue = "Y";
        String sentinelResponse = "Y";

        while (sentinelResponse.equals(sentinelValue)) {

            // section of code which will be optionally run multiple times - BEGIN
            // prompt
            System.out.print("Please enter a string: ");
            input = scan.nextLine();

            // testing
            // System.out.println(input + " has " + countVowels(input) + " vowels.");

            // output
            System.out.println("Entered string:\t\t" + input);
            System.out.println("Number of vowels:\t" + countVowels(input));
            // section of code which will be optionally run multiple times - END

            // sentinel checking
            System.out.println();
            System.out.print("Would you like to run program again (y/n)? ");
            sentinelResponse = scan.nextLine().toUpperCase().trim();
            System.out.println();

        }
        // cleanup
        scan.close();
    }

    private static int countVowels(String text) {
        if (text.isEmpty()) { // all the chars have been processed
            return 0;
        } else {
            // main processing section
            char character = text.charAt(0); // first char
            int count = isVowel(character) ? 1 : 0; // do we add 1 for this char or not
            // recurse with all except first character
            return count + countVowels(text.substring(1));
        }
    }

    public static boolean isVowel(char ch) {
        // true if a vowel, false if not
        ch = Character.toLowerCase(ch); // remove case as a concern
        // testing each for equality to vowels as part of an OR statement
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
