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

    // setup
    System.out.println();
    Scanner scan = new Scanner(System.in);
    double annualInterestRate;

    do {
      System.out.println("The interest rate will be the same for all accounts.");
      System.out.print("What is the annual interest rate? (e.g. 3.5 )\t");
      annualInterestRate = scan.nextDouble() / 100.0; // conversion
      scan.nextLine(); // clear the line return
      if (!CheckAnnualInterestRate(annualInterestRate)) {
        System.out.println("Annual interest rate must be between 0 and 100.");
      }
    } while (!CheckAnnualInterestRate(annualInterestRate));
    System.out.println();

    // setup sentinel
    String sentinelValue = "Y";
    String sentinelResponse = "Y";
    // start sentinel
    while (sentinelResponse.equals(sentinelValue)) {

      // vars for inside the loop.
      int id;
      double balance, deposit, withdrawal;

      System.out.println("Please enter the relevant details for the account:");
      System.out.println();

      // no checking or conditions on ID
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
        System.out.print("How much would you like to withdraw?\t\t");
        withdrawal = scan.nextDouble();
        scan.nextLine(); // clear the line return
        withdrawalResult = myAccount.withdraw(withdrawal);
        if (!withdrawalResult) {
          System.out.println("You don't have that much money.");
        }
      } while (!withdrawalResult);

      // show the summary
      System.out.println(myAccount);

      // sentinel checking
      System.out.print("Do you want to do it again? (Y to continue): ");
      sentinelResponse = scan.nextLine().toUpperCase().trim();
      System.out.println();
    } // end sentinel loop

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
