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

    // annualInterestRate is not in sentinel loop...
    // since all users will have the same interest rate:

    // setup sentinel
    String sentinelValue = "Y";
    String sentinelResponse = "Y";

    while (sentinelResponse.equals(sentinelValue)) {

      int id;
      double balance, deposit, withdrawal;
      double annualInterestRate;

      // BEGIN the loop of one account
      System.out.println("Please enter the relevant details for a new account #1:");
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

      Account myAccount = new Account(id, balance);
      myAccount.setAnnualInterestRate(annualInterestRate);

      do {
        System.out.print("how much would you like to deposit?\t\t");
        deposit = scan.nextDouble();
        scan.nextLine(); // clear the line return
        if (!CheckPositive(deposit)) {
          System.out.println("the value must be positive.");
        }
      } while (!CheckPositive(deposit));
      myAccount.deposit(deposit);

      Boolean withdrawalResult;
      do {
        System.out.print("how much would you like to withdraw?\t\t");
        withdrawal = scan.nextDouble();
        scan.nextLine(); // clear the line return
        withdrawalResult = myAccount.withdraw(withdrawal);
        if (!withdrawalResult) {
          System.out.println("You don't have that much money.");
        }
      } while (!withdrawalResult);

      // show the summary
      System.out.println(myAccount);

      // END the loop of one account - myAccount

      // ** add the other account.

      // BEGIN the loop of second account
      System.out.println("Please enter the relevant details for a new account #2:");
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

      Account yourAccount = new Account(id, balance);
      yourAccount.setAnnualInterestRate(annualInterestRate);

      do {
        System.out.print("how much would you like to deposit?\t\t");
        deposit = scan.nextDouble();
        scan.nextLine(); // clear the line return
        if (!CheckPositive(deposit)) {
          System.out.println("the value must be positive.");
        }
      } while (!CheckPositive(deposit));
      yourAccount.deposit(deposit);

      do {
        System.out.print("how much would you like to withdraw?\t\t");
        withdrawal = scan.nextDouble();
        scan.nextLine(); // clear the line return
        withdrawalResult = yourAccount.withdraw(withdrawal);
        if (!withdrawalResult) {
          System.out.println("You don't have that much money.");
        }
      } while (!withdrawalResult);

      // show the summary
      System.out.println(yourAccount);

      // END the loop of second account - yourAccount

      // sentinel checking
      System.out.print("Do you want to do it again? (Y to continue): ");
      sentinelResponse = scan.nextLine().toUpperCase().trim();
      System.out.println();
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
