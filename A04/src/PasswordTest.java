// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  4
// IDE Name:    VS Code

import java.util.Scanner;

public class PasswordTest {
  public static void main(String[] args) {

    // setup/input section
    boolean testLength;
    boolean testOneLowercase;
    boolean testOneUppercase;
    boolean testOneDigit;
    boolean testOneNotLetterNotDigit;
    String enteredPassword;
    String verdict;
    final String SENTINELCONTINUEANSWER = "Y";
    String sentinelResponse = SENTINELCONTINUEANSWER;

    Scanner scan = new Scanner(System.in);
    Scanner scanSentinel = new Scanner(System.in);

    // one time instructions
    System.out.println();
    System.out.println("A valid password has at least 7 characters and includes at least one lower-case letter, ");
    System.out.println("\tleast one upper-case letter, at least one digit, and at least one character that is ");
    System.out.println("\tneither a letter nor a digit.");

    while (SENTINELCONTINUEANSWER.equalsIgnoreCase(sentinelResponse)) {
      { // reset value for each loop.
        testLength = false;
        testOneLowercase = false;
        testOneUppercase = false;
        testOneDigit = false;
        testOneNotLetterNotDigit = false;
        enteredPassword = "";
        verdict = "";

        System.out.println();
        System.out.print("Please enter a password:\t");
        enteredPassword = scan.nextLine().trim();

        // processing section
        // Test: atleast 7 characters
        testLength = (enteredPassword.length() >= 7) ? true : false;

        // loop through the string (foreach) and test each character for each test.
        // each test has only to be true one time for the value to stay true at the end
        for (char c : enteredPassword.toCharArray()) {
          // Test: includes one lowercase letter
          testOneLowercase = (Character.isLowerCase(c)) ? true : testOneLowercase;
          // Test: includes one uppercase letter
          testOneUppercase = (Character.isUpperCase(c)) ? true : testOneUppercase;
          // Test: includes one digit
          testOneDigit = (Character.isDigit(c)) ? true : testOneDigit;
          // Test: includes one neither letter or digit (symbol?)
          testOneNotLetterNotDigit = (!Character.isLetterOrDigit(c)) ? true : testOneNotLetterNotDigit;
        }

        // only if all are true is it a valid password
        if (testLength && testOneLowercase && testOneUppercase && testOneDigit && testOneNotLetterNotDigit) {
          verdict = "Valid Password";
        } else {
          verdict = "Invalid Password";
        }
        // output section
        System.out.println();
        System.out.println("Entered Password:\t\t" + enteredPassword);
        System.out.println("Verdict:\t\t\t" + verdict);
      }
      System.out.println();
      System.out.print("Enter Y to continue:\t");
      sentinelResponse = scanSentinel.nextLine().trim();

    }

    // cleanup section, any resources to close?
    scan.close();
    scanSentinel.close();

  }
}
