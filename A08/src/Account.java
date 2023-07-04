// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  8
// IDE Name:    VS Code

import java.util.Date;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;

@SuppressWarnings("unused")

public class Account {
  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;

  public Account() {
    // Non-argument constructor method that creates a default account (with default
    // values)
    id = 0;
    balance = 0.0;
    annualInterestRate = 0.0;
    dateCreated = new Date();
  }

  public Account(int id, double initialBalance) {
    // Constructor method that creates an account with specified ID and initial
    // balance
    this.id = id;
    this.balance = initialBalance;
    annualInterestRate = 0.0;
    dateCreated = new Date();

  }

  public int getId(int id) {
    return id;
  }

  public void setId(int id) {
    assert id < 0 : "ID must be greater than zero";
    this.id = id;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double newRate) {
    assert newRate > 0.0 && newRate < 1.0
        : "The interest rates must be between a % expressed a decimal, thus between 0 and 1.";
    this.annualInterestRate = newRate;
  }

  public double getbalance() {
    return balance;
  }

  public void setbalance(double newBalance) {
    assert newBalance > 0 : "The balance must be greater than zero.";
    this.balance = newBalance;
  }

  public Date getDate() {
    return dateCreated;
  }

  public double getMonthlyInterestRate() {
    return annualInterestRate / 12.0;
  }

  public double getMonthlyInterest() {
    return balance * getMonthlyInterestRate();
  }

  public Boolean withdraw(double withdrawalAmount) {
    // handle account overdraft
    if (balance < withdrawalAmount) {
      return false;
    }
    balance = balance - withdrawalAmount;
    return true;

  }

  public void deposit(double depositAmount) {
    assert depositAmount > 0 : "Deposite amount must be > 0.";
    balance = balance + depositAmount;
  }

  public String toString() {
    return "\n" +
        "Account ID:\t\t" + id + "\n" +
        "Account Balance\t\t" + formatMoney(balance) + "\n" +
        "Annual Interest Rate:\t" + formatInterestRate(annualInterestRate) + "\n" +
        "Monthly Interest:\t" + formatMoney(getMonthlyInterest()) + "\n" +
        "Date Opened:\t\t" + dateCreated + "\n" +
        "\n";
  }

  private String formatInterestRate(double incomingInterestRate) {
    // format % method required by assignment
    NumberFormat fmt = NumberFormat.getPercentInstance();
    fmt.setMaximumFractionDigits(1);
    return fmt.format(incomingInterestRate);
  }

  private String formatMoney(double incomingMoney) {
    // format $1.23
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    return currencyFormat.format(incomingMoney);
  }
}

// TO DO:
// Remove suppress warnings
