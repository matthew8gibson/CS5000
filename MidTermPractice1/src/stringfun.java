import java.util.Scanner

public class stringfun {
    Scanner scan = new Scanner(System.in)
    //do some string fun
    System.out.print("Hello. Please enter your first and last name: ");
    String firstAndLastName = scan.nextLine();
    System.out.print("Hello. Please enter your city: ");
    String city = scan.nextLine();

    System.out.println("Length: " firstAndLastName.Length());
    System.out.println("You are " + firstAndLastName + " from " + city);
    System.out.println(firstAndLastName.concat(" of ").concat(city));
    System.out.println(firstAndLastName.toUppercase());
    System.out.println(firstAndLastName.toLowercase());
    lastName = firstAndLastName.substring((firstAndLastName.indexof(" ") + 1), (firstAndLastName.Length() - 1));
    System.out.println(lastName.concat(" is your last name"));
}