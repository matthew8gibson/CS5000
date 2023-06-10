import java.util.Scanner;

public class IntegerInputExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a series of numbers (enter -1 to stop):");

    int number;
    while (true) {
      System.out.print("Enter a number: ");
      number = scanner.nextInt();

      if (number == -1) {
        System.out.println("Stopping the program.");
        break;
      }

      System.out.println("You entered: " + number);
    }

    scanner.close();
  }
}
