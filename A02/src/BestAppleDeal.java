// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  2
// IDE Name:    VS Code

import java.util.Scanner;

public class BestAppleDeal {
  public static void main(String[] args) {
    // setup/input section
    // wrapper to optionally skip prompt, if cmdline parameter is entered.
    int smallBoxWeight, smallBoxPrice;
    int largeBoxWeight, largeBoxPrice;
    if (args.length == 0) {
      Scanner s = new Scanner(System.in);
      System.out.println();
      System.out.print("Please enter the small box weight in pounds: ");
      smallBoxWeight = s.nextInt();
      System.out.print("Please enter the small box price in dollars: ");
      smallBoxPrice = s.nextInt();
      System.out.print("Please enter the large box weight in pounds: ");
      largeBoxWeight = s.nextInt();
      System.out.print("Please enter the large box price in dollars: ");
      largeBoxPrice = s.nextInt();
      s.close(); // prompted in VS Code to close to free up resources
    } else {
      smallBoxWeight = Integer.parseInt(args[0]);
      smallBoxPrice = Integer.parseInt(args[1]);
      largeBoxWeight = Integer.parseInt(args[2]);
      largeBoxPrice = Integer.parseInt(args[3]);
    }

    // processing section - calculate the bigger deal.
    // Pounds Per Dollar - Bigger is better
    String judgement = "";
    float smallBoxValue = (float) smallBoxWeight / (float) smallBoxPrice;
    float largeBoxValue = (float) largeBoxWeight / (float) largeBoxPrice;

    System.out.println();
    System.out.println(
        "Test - Debugging- small: " + smallBoxValue + " large: " + largeBoxValue + " Big Number is a better deal");

    if (smallBoxValue > largeBoxValue) {
      judgement = "The smaller box is a better deal";
    } else if (smallBoxValue < largeBoxValue) {
      judgement = "The large box is a better deal";
    } else {
      judgement = "Both boxes are of the same value";
    }

    // output section
    System.out.println();
    System.out.println("Small box weight:\t" + smallBoxWeight + " Pounds");
    System.out.println("Small box price:\t" + smallBoxPrice + " Dollars");
    System.out.println("Large box weight:\t" + largeBoxWeight + " Pounds");
    System.out.println("Large box price:\t" + largeBoxPrice + " Dollars");
    System.out.println("Judgement:\t\t" + judgement);

    // cleanup section, any resources to close?
  }
}
