import java.util.Scanner;

public class A01P2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int number = scan1.nextInt();
        int sum = 0;


        // processing
        int currentNumber = number;

        while (currentNumber > 0) {
            sum = sum + (currentNumber % 10); // adding to sum, the last digit
            currentNumber = currentNumber / 10; // drops last digit for the next round
        } // currentNumber got to zero

        System.out.println("The input number is: \t" + number);
        System.out.println("The sum of digits is: \t" + sum);

        scan1.close();
    }
}
