// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  5
// IDE Name:    VS Code

import java.util.Scanner;

public class Password {
  public static void main(String[] args) {

    // setup/input section
    boolean testLength;
    boolean testLowercase;
    boolean testUppercase;
    boolean testDigit;
    boolean testOnlyLettersAndDigits;
    String enteredPassword = "";
    String verdict;
    final String sentinelValue = "sentinel";
    final int lengthRequirement = 9;
    final int lowercaseRequirementCount = 3;
    final int uppercaseRequirementCount = 3;
    final int digitRequirementCount = 3;

    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Just type " + sentinelValue + " to stop the program.");

    // runs for each prompt to collect, analyze, and output
    do {
      // reset value for each loop.
      testLength = false;
      testLowercase = false;
      testUppercase = false;
      testDigit = false;
      testOnlyLettersAndDigits = false;
      enteredPassword = "";
      verdict = "";

      System.out.println();
      System.out.print("Please enter a password:\t");
      enteredPassword = scan.nextLine().trim();

      if (enteredPassword.equals(sentinelValue)) {
        // System.out.print("All Done. Thanks for entering the value to end!");
        break; // exits the loop,
      }

      // processing the data section

      // Performing all the tests
      testLength = TestLength(enteredPassword, lengthRequirement);
      testLowercase = TestLowercase(enteredPassword, lowercaseRequirementCount);
      testUppercase = TestUpperCase(enteredPassword, uppercaseRequirementCount);
      testDigit = TestDigits(enteredPassword, digitRequirementCount);
      testOnlyLettersAndDigits = testOnlyLettersAndDigits(enteredPassword);

      // Debug Section
      boolean debug = false;
      if (debug) {
        System.out.println();
        System.out.println("Debug");
        System.out.println(" Length: " + testLength);
        System.out.println(" Lower:" + testLowercase);
        System.out.println(" Upper: " + testUppercase);
        System.out.println(" Digit: " + testDigit);
        System.out.println(" OnlyLetterDigit: " + testOnlyLettersAndDigits);
      }

      // only if all are true is it a valid password
      if (testLength && testLowercase && testUppercase && testDigit && testOnlyLettersAndDigits) {
        verdict = "Valid Password";
      } else {
        verdict = "Invalid Password";
      }
      // output section
      System.out.println();
      System.out.println("Entered Password:\t\t" + enteredPassword);
      System.out.println("Verdict:\t\t\t" + verdict);

    } while (enteredPassword != sentinelValue);

    // cleanup section, any resources to close?
    scan.close();

  }

  public static boolean TestLength(String candidate, int length) {
    return (candidate.length() >= length) ? true : false;
  }

  public static boolean TestLowercase(String candidate, int numberRequired) {
    int count = 0;
    for (char c : candidate.toCharArray()) {
      count = (Character.isLowerCase(c)) ? count + 1 : count;
    }
    if (count >= numberRequired) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean TestUpperCase(String candidate, int numberRequired) {
    int count = 0;
    for (char c : candidate.toCharArray()) {
      count = (Character.isUpperCase(c)) ? count + 1 : count;
    }

    if (count >= numberRequired) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean TestDigits(String candidate, int numberRequired) {
    int count = 0;
    for (char c : candidate.toCharArray()) {
      count = (Character.isDigit(c)) ? count + 1 : count;
    }
    if (count >= numberRequired) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean testOnlyLettersAndDigits(String candidate) {
    for (char c : candidate.toCharArray()) {
      if (!Character.isLetterOrDigit(c)) {
        // System.out.print("Debug: Non Letter or Digit Found");
        return false;
      }
    }
    // if no character failed... then the password passes.
    return true;
  }

}
