import java.util.Scanner;

public class SentinelLoopExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int value;

    System.out.println("Enter values (0 to quit):");

    do {
      value = input.nextInt();
      sum += value;
    } while (value != 0);

    System.out.println("The sum is " + sum);
  }
}
