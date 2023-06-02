// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  2
// IDE Name:    VS Code

import java.util.Scanner;

public class PalindromeNumber {

  public static void main(String args[]) {

    // setup/input section
    // wrapper to optionally skip prompt, if cmdline parameter is entered.
    int inputValue;
    if (args.length == 0) {
      Scanner s = new Scanner(System.in);
      System.out.println();
      System.out.print("Please enter a 5-digits integer value:");
      inputValue = s.nextInt();
      s.close(); // prompted in VS Code to close to free up resources
    } else {
      inputValue = Integer.parseInt(args[0]);
    }
    String judgement;
    int inputRequiredLength = 5;

    // processing section
    System.out.println();
    // Task 1 - confirm the input is 5 characters
    /// what if the first character is 0?

    int inputActualLength = 0;
    // method 1 for getting length
    inputActualLength = String.valueOf(inputValue).length();
    // System.out.println("Input Value Length:\t\t" + inputActualLength);

    // method 2 for getting length
    int i = inputValue;
    inputActualLength = 0;
    for (; i != 0; i /= 10, ++inputActualLength) {
      // nothing to do, just counting the number of times it loops until dividing by
      // 10 gets to 0
    }
    // System.out.println("Input Value Length:\t\t" + inputActualLength);

    // method 3 for getting length
    inputActualLength = (int) (Math.log10(inputValue) + 1);
    // System.out.println("Input Value Length:\t\t" + inputActualLength);

    // dropping out if the length is not right.
    if (inputActualLength != inputRequiredLength) {
      judgement = "Invalid input, must be 5 digits number.";
    } else {
      // given a 5 char int, test for palindrome
      if ((inputValue / 10000 == inputValue % 10) && (inputValue / 1000 == inputValue % 100)) {
        judgement = "Palindrome";
      } else {
        judgement = "Not Palindrome";
      }
    }

    // output section
    System.out.println();
    System.out.println("Input Value:\t" + inputValue);
    System.out.println("Judgement:\t" + judgement);

    // cleanup section, any resources to close?

  }
}
