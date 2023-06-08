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
    boolean testLength = false;
    boolean testOneLowercase = false;
    boolean testOneUppercase = false;
    boolean testOneDigit = false;
    boolean testOneNotLetterNotDigit = false;

    System.out.println();
    System.out.println("A valid password has at least 7 characters and includes at least one lower-case letter, ");
    System.out.println("\tleast one upper-case letter, at least one digit, and at least one character that is ");
    System.out.println("\tneither a letter nor a digit.");
    System.out.println();
    System.out.print("Please enter a valid password:\t");
    String enteredPassword, verdict;
    Scanner scan = new Scanner(System.in);
    enteredPassword = scan.nextLine();
    scan.close();

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
    System.out.println("Entered Password:\t" + enteredPassword);
    System.out.println("Verdict:\t\t" + verdict);

    // cleanup section, any resources to close?

  }
}
