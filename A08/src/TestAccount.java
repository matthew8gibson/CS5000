// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  8
// IDE Name:    VS Code

import java.util.Scanner;

//@SuppressWarnings("unused")

public class TestAccount {
  public static void main(String[] args) {

    // part 1 set values
    Account myObject = new Account(123456, 10000);
    myObject.setAnnualInterestRate(.025);
    myObject.withdraw(3500);
    myObject.deposit(500);
    // part 1 print values
    System.out.println();
    System.out.println("First Test Output:");
    System.out.println(myObject);

    // part 3 - allowing user input and via sentinel loop.
    System.out.println("Now, for the interactive part:");
    System.out.println();

    // As for User Input:
    Scanner scan = new Scanner(System.in);

    // setup sentinel
    String sentinelValue = "Y";
    String sentinelResponse = "Y";

    while (sentinelResponse.equals(sentinelValue)) {
      // BEGIN the loop of one account
      int id;
      double balance, annualInterestRate, deposit, withdrawal;

      System.out.println("Please enter the relevant details for a new account:");
      System.out.println();

      // no checking or conditions on ID?
      System.out.print("What will the ID be?\t\t\t\t");
      id = scan.nextInt();
      scan.nextLine(); // clear the line return

      do {
        System.out.print("What is the balance?\t\t\t\t");
        balance = scan.nextDouble();
        scan.nextLine(); // clear the line return
        if (!CheckPositive(balance)) {
          System.out.println("The balance cannot be negative.");
        }

      } while (!CheckPositive(balance));

      do {
        System.out.print("What is the annual interest rate? (e.g. 3.5 )\t");
        annualInterestRate = scan.nextDouble() / 100.0; // conversion
        scan.nextLine(); // clear the line return
        if (!CheckAnnualInterestRate(annualInterestRate)) {
          System.out.println("Annual interest rate must be between 0 and 100.");
        }
      } while (!CheckAnnualInterestRate(annualInterestRate));

      do {
        System.out.print("how much would you like to deposit?\t\t");
        deposit = scan.nextDouble();
        scan.nextLine(); // clear the line return
        if (!CheckPositive(deposit)) {
          System.out.println("the value must be positive.");
        }
      } while (!CheckPositive(deposit));

      do {
        System.out.print("how much would you like to withdraw?\t\t");
        withdrawal = scan.nextDouble();
        scan.nextLine(); // clear the line return
        if (!CheckPositive(withdrawal)) {
          System.out.println("the value must be positive");
        }
      } while (!CheckPositive(withdrawal));

      // creating and populating the objects.
      Account myAccount = new Account(id, balance);
      myAccount.setAnnualInterestRate(annualInterestRate);
      myAccount.withdraw(withdrawal);
      myAccount.deposit(deposit);

      // show the summary
      System.out.println(myAccount);

      // END the loop of one account

      // sentinel checking
      System.out.print("Do you want to do it again? (Y to continue): ");
      sentinelResponse = scan.nextLine().toUpperCase().trim();
    }

    // cleanup.
    scan.close();
  }

  private static Boolean CheckAnnualInterestRate(double annualInterestRate) {
    if ((annualInterestRate > 0) && (annualInterestRate < 1)) {
      return true;
    }
    return false;
  }

  private static Boolean CheckPositive(double balance) {
    if (balance >= 0) {
      return true;

    }
    return false;
  }

}

// TO DO:
// Remove suppress warnings
