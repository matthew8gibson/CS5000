// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  5
// IDE Name:    VS Code

import java.util.Scanner;

public class KeyPad {
  public static void main(String[] args) {

    // out loops
    final String SENTINELCONTINUEANSWER = "Y";
    String sentinelResponse = SENTINELCONTINUEANSWER;
    Scanner scan = new Scanner(System.in);

    // setup/input section
    String inputValue;
    Scanner s = new Scanner(System.in);
    while (SENTINELCONTINUEANSWER.equalsIgnoreCase(sentinelResponse)) {
      // setup in the loop
      String outputValue = "";

      // getting input in the loop
      System.out.println();
      System.out.print("Enter phone number:");
      inputValue = s.nextLine();

      // processing section in the loop.
      // loop through each characters
      // convert letters to the mapped number
      // other characters pass straight through
      for (char c : inputValue.toCharArray()) {
        if (Character.isLetter(c)) {
          // letters, get converted to the number for dialing.
          outputValue = outputValue + GetNumber(Character.toUpperCase(c));
        } else {
          // not letters are just adding it back in without tranformation
          // this is likely for numbers, dashes, and parenthisis or +
          outputValue = outputValue + c;
        }
      }

      // output section - still in the loop.
      System.out.println();
      System.out.println("You entered:\t" + inputValue);
      System.out.println("Phone Number:\t" + outputValue);

      // wrapping up the loop
      System.out.println();
      System.out.print("Enter Y to continue:\t");
      sentinelResponse = scan.nextLine().trim();
    }

    // close out
    s.close();
    scan.close();

  }

  public static int GetNumber(char uppercaseLetter) {
    // forcing upper case here, just in case.
    uppercaseLetter = Character.toUpperCase(uppercaseLetter);
    switch (uppercaseLetter) {
      case 'A':
      case 'B':
      case 'C':
        return 2;
      case 'D':
      case 'E':
      case 'F':
        return 3;
      case 'G':
      case 'H':
      case 'I':
        return 4;
      case 'J':
      case 'K':
      case 'L':
        return 5;
      case 'M':
      case 'N':
      case 'O':
        return 6;
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
        return 7;
      case 'T':
      case 'U':
      case 'V':
        return 8;
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
        return 9;
      default:
        // THROW ERROR?
        return 0; // this is an error should never happen
    }

  }
}
