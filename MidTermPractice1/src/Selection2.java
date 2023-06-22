import java.util.Scanner;

public class Selection2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the first integer: ");
        int int1 = scan.nextInt();
        System.out.print("enter the second integer: ");
        int int2 = scan.nextInt();

        if (int1 % int2 == 0) {
            System.out.println("The first number is divisible by the second number.");

        } else {
            System.out.println("The first number is not divisible by the second number.");

        }

    }
}
