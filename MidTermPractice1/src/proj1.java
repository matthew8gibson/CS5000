import java.util.Scanner;

public class proj1 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("hi");
    // ConvertCelciusToFarenheit();
    SumDigitsInInteger();
    // boolean first = true || true && false; // true // true || means the rest of
    // it doesn't matter
    // boolean second = true && true || false; // true // true && true means the
    // rest doesn't matter
    // System.out.println(first);
    // System.out.println(second);

    System.out.println("done");
  }

  public static void SumDigitsInInteger() {
    // setup
    int input, output = 0, remainingInt, digit;
    Scanner scan = new Scanner(System.in);

    // user input
    System.out.print("tell me the number: ");
    input = scan.nextInt();

    // calculating
    remainingInt = input;
    while (remainingInt > 0) {
      digit = input % 10; // get the last digit of the current number
      output += digit; // adding that last number to the output
      remainingInt /= 10; // dividing by 10 removes the right digit from an int
    }

    // output
    System.out.println("The sum is: " + output);

    // cleanup
    scan.close();

  }

  public static void ConvertCelciusToFarenheit() {
    Scanner scan = new Scanner(System.in);

    double output, input;

    System.out.print("What is the temp in Celsius? ");
    input = scan.nextDouble();
    output = ((9.0 / 5.0) * input) + 32;

    System.out.println(input + " Celcius is " + output + " Farenheit");

    scan.close();

  }

}
