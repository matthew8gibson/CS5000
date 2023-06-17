import java.util.Scanner;

public class Scratch2 {
  public static void main(String[] args) {
    // output text and receive data
    Scanner scan = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name = scan.nextLine();
    scan.nextLine(); // clear the thing?
    System.out.println("Hello, " + name);
    scan.close();

    "jello".indexOf("el");
  }
}