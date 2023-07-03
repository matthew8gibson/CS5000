// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  8
// IDE Name:    VS Code

import java.util.Date;

/**
 * Account
 */
@SuppressWarnings("unused")

public class Account {
  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;

  public Account() {
    id = 0;
    balance = 0.0;
    annualInterestRate = 0.0;
    dateCreated = new Date();
  }

  public Account(int id, double initialBalance) {
    this.id = id;
    balance = initialBalance;
    annualInterestRate = 0.0;
    dateCreated = new Date();

  }

  public int getId(int id) {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double newRate) {
    this.annualInterestRate = newRate;
  }

  public double balance() {
    return balance;
  }

  public void balance(double newBalance) {
    this.balance = newBalance;
  }

  public Date getDate() {
    return dateCreated;
  }

  public double getMonthlyInterestRate() {

    return annualInterestRate / 12.0; // .0 to make it a double
  }

}

// TO DO:
// Remove suppress warnings
