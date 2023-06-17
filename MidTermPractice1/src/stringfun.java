import java.util.Scanner;

public class stringfun {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // do some string fun
    System.out.print("Hello. Please enter your first and last name: ");

    String lastName;
    String firstAndLastName = scan.nextLine();
    System.out.print("Hello. Please enter your city: ");
    String city = scan.nextLine();

    System.out.println("Length: " + firstAndLastName.length());
    System.out.println("You are " + firstAndLastName + " from " + city);
    System.out.println(firstAndLastName.concat(" of ").concat(city));
    System.out.println(firstAndLastName.toUpperCase());
    System.out.println(firstAndLastName.toLowerCase());
    lastName = firstAndLastName.substring((firstAndLastName.indexOf(" ") + 1), (firstAndLastName.length() - 1));
    System.out.println(lastName.concat(" is your last name"));
    scan.close();
  }
}
