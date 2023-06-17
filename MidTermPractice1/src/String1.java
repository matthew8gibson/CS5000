import java.util.Scanner;

public class String1 {
  public static void main(String[] args) {
    System.out.println("hello.");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    System.out.println("Jello." + input);
    scan.close();

  }
}
