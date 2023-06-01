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
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the annual income:\t");
        int annualIncome = s.nextInt();
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

        // ideas.
        // keep all numbers as int, then divide by 100 (to make the % work)

        // processing section
        { // idea #3 nested if statements
            if (annualIncome <= INCOMEBOUNDARY0) { // in the 0 range (under 30k)
                taxAmount = (annualIncome / 100 * RATE0); // Actual complete tax amount.
                taxBracket = RATE0;
            } else {
                taxAmount = (INCOMEBOUNDARY0 / 100 * RATE0); // tax amount - first block only - 900
                if ((annualIncome > INCOMEBOUNDARY0) && (annualIncome <= INCOMEBOUNDARY1)) { // in the 1 range (between
                                                                                             // 30 and 70)
                    taxAmount += ((annualIncome - INCOMEBOUNDARY0) / 100 * RATE1); // first block (900 from before) +
                                                                                   // partial second block.
                    taxBracket = RATE1;
                } else {
                    taxAmount += ((INCOMEBOUNDARY1 - INCOMEBOUNDARY0) / 100 * RATE1); // tax amount - adding second
                                                                                      // block
                    // to the first
                    if ((annualIncome > INCOMEBOUNDARY1) && (annualIncome <= INCOMEBOUNDARY2)) { // in the 2 range
                                                                                                 // (between 70 and 150)
                        taxAmount += ((annualIncome - INCOMEBOUNDARY1) / 100 * RATE2);
                        taxBracket = RATE2;
                    } else {

                    }
                }
            }

        }

        // output section
        System.out.println();
        System.out.println("Your income:\t" + annualIncome);
        System.out.println("Your tax bracket:" + taxBracket);
        System.out.println("Your tax amount:" + taxAmount);

        // cleanup section
        s.close(); // prompted in VS Code

    }
}

/*
 * 120
 * Your income: $120000
 * Your tax bracket: 15%
 * Your tax amount: $12400
 */

/*
 * Calculations
 * if ()
 */