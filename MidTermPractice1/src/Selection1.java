import java.util.Scanner;

public class Selection1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an integer: ");
        int input = scanner.nextInt();
        if (input > 0) {
            System.out.println("the number is positive");
        } else if (input < 0) {
            System.out.println("The integer is negative");
        } else if (input == 0) {
            System.out.println("the number is zero");
        }
        scanner.close();
    }
}
