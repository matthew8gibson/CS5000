// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  2
// IDE Name:    VS Code

import java.util.Scanner;

public class IncomeTax {

  public static void main(String args[]) {

    // setup/input section
    // wrapper to optionally skip prompt, if cmdline parameter is entered.
    int annualIncome;
    if (args.length == 0) {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the annual income:\t");
      annualIncome = s.nextInt();
      s.close(); // prompted in VS Code to close to free up resources
    } else {
      annualIncome = Integer.parseInt(args[0]);
    }

    int taxAmount = 0;
    int taxBracket = 0;
    final int INCOMEBOUNDARY0 = 30000;
    final int INCOMEBOUNDARY1 = 70000;
    final int INCOMEBOUNDARY2 = 150000;
    final int INCOMEBOUNDARY3 = 300000;
    final int INCOMEBOUNDARY4 = 900000;

    final int RATE0 = 3;
    final int RATE1 = 10;
    final int RATE2 = 15;
    final int RATE3 = 20;
    final int RATE4 = 35;
    final int RATE5 = 40;

    // processing section
    {
      // in the 0 range (under 30k)
      if (annualIncome <= INCOMEBOUNDARY0) {
        // proportionate taxes in this range to complete the calculation
        taxAmount = (annualIncome / 100 * RATE0);
        taxBracket = RATE0;
      } else {
        // max taxes under first threshold before moving to next range.
        taxAmount = (INCOMEBOUNDARY0 / 100 * RATE0);
        // in the 1 range (under 30k)
        if ((annualIncome > INCOMEBOUNDARY0) && (annualIncome <= INCOMEBOUNDARY1)) {
          // proportionate taxes in this range to complete the calculation
          taxAmount += ((annualIncome - INCOMEBOUNDARY0) / 100 * RATE1);
          taxBracket = RATE1;
        } else {
          // max taxes under first threshold before moving to next range.
          taxAmount += ((INCOMEBOUNDARY1 - INCOMEBOUNDARY0) / 100 * RATE1);
          // in the 2 range (70/150)
          if ((annualIncome > INCOMEBOUNDARY1) && (annualIncome <= INCOMEBOUNDARY2)) {
            // proportionate taxes in this range to complete the calculation
            taxAmount += ((annualIncome - INCOMEBOUNDARY1) / 100 * RATE2);
            taxBracket = RATE2;
          } else {
            // max taxes under first threshold before moving to next range.
            taxAmount += ((INCOMEBOUNDARY2 - INCOMEBOUNDARY1) / 100 * RATE2);
            // in the 3 range (150/300)
            if ((annualIncome > INCOMEBOUNDARY2) && (annualIncome <= INCOMEBOUNDARY3)) {
              // proportionate taxes in this range to complete the calculation
              taxAmount += ((annualIncome - INCOMEBOUNDARY2) / 100 * RATE3);
              taxBracket = RATE3;
            } else {
              // max taxes under first threshold before moving to next range.
              taxAmount += ((INCOMEBOUNDARY3 - INCOMEBOUNDARY2) / 100 * RATE3);
              // in the 3 range (300/900)
              if ((annualIncome > INCOMEBOUNDARY3) && (annualIncome <= INCOMEBOUNDARY4)) {
                // proportionate taxes in this range to complete the calculation
                taxAmount += ((annualIncome - INCOMEBOUNDARY3) / 100 * RATE4);
                taxBracket = RATE4;
              } else {
                // max taxes under first threshold before moving to next range.
                taxAmount += ((INCOMEBOUNDARY4 - INCOMEBOUNDARY3) / 100 * RATE4);
                // anything above the top amount of 900
                taxAmount += ((annualIncome - INCOMEBOUNDARY4) / 100 * RATE5);
                taxBracket = RATE5;
              }
            }
          }
        }
      }

      // output section
      System.out.println();
      System.out.println("Your income:\t\t$" + annualIncome);
      System.out.println("Your tax bracket:\t" + taxBracket + "%");
      System.out.println("Your tax amount:\t$" + taxAmount);

      // cleanup section, any resources to close?

    }
  }
}