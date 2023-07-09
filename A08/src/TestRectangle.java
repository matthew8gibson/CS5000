
// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 8
// IDE Name: VS Code
import java.util.Scanner;

//@SuppressWarnings("unused")

public class TestRectangle {

  public static void main(String[] args) {

    // overall plan. based on discussion list feedback, I'll do a sentinel loop
    // between 3 objects with name as appropriate and handle code the name
    // statically.

    // setup

    double height, width;
    Scanner scan = new Scanner(System.in);

    // BEGIN myRectangle is a default object. (i.e., uses default width and height)
    Rectangle myRectangle = new Rectangle();
    myRectangle.setName("myRectangle");
    // print
    System.out.println();
    System.out.println(myRectangle.toString());
    myRectangle.displaySummary();
    // END myRectangle is a default object. (i.e., uses default width and height)

    // setup sentinel
    String sentinelValue = "Y";
    String sentinelResponse = "Y";

    while (sentinelResponse.equals(sentinelValue)) {
      // BEGIN hisRectangle---------------------
      // collect width
      do {
        System.out.print("Enter Width for hisRectangle:\t\t"); // getting width
        width = scan.nextDouble();
        scan.nextLine(); // clear the line
        if (width <= 0) {
          System.out.println("the value must be greater than zero.");
        }
      } while (width <= 0);

      // collect height
      do {
        System.out.print("Enter Height for hisRectangle:\t\t"); // getting height
        height = scan.nextDouble();
        scan.nextLine(); // clear the line
        if (height <= 0) {
          System.out.println("the value must be greater than zero.");
        }
      } while (height <= 0);

      // Create object
      Rectangle hisRectangle = new Rectangle(height, width);
      hisRectangle.setName("hisRectangle"); // ** hardcoded

      // print it out
      System.out.println(); // beautification
      System.out.println(hisRectangle.toString());
      hisRectangle.displaySummary();

      // testing ALL methods
      System.out.printf("Displaying getName method: \t\t%s\n", hisRectangle.getName());
      System.out.printf("Displaying getWidth method: \t\t%s\n", hisRectangle.getWidth());
      System.out.printf("Displaying getHeight method: \t\t%s\n", hisRectangle.getHeight());
      System.out.printf("Displaying getArea method: \t\t%s\n", hisRectangle.getArea());
      System.out.printf("Displaying getPerimeter method: \t%s\n", hisRectangle.getPerimter());
      System.out.println();

      // END hisRectangle-----------------------

      // BEGIN herRectangle---------------------
      // collect height
      do {
        System.out.print("Enter Height for herRectangle:\t\t"); // getting height
        height = scan.nextDouble();
        scan.nextLine(); // clear the line
        if (height <= 0) {
          System.out.println("the value must be greater than zero.");
        }
      } while (height <= 0);

      // collect width
      do {
        System.out.print("Enter Width for herRectangle:\t\t"); // getting width
        width = scan.nextDouble();
        scan.nextLine(); // clear the line
        if (width <= 0) {
          System.out.println("the value must be greater than zero.");
        }
      } while (width <= 0);

      // Create object
      Rectangle herRectangle = new Rectangle(height, width);
      herRectangle.setName("herRectangle"); // ** hardcoded

      // print it out
      System.out.println(); // beautification
      System.out.println(herRectangle.toString());
      herRectangle.displaySummary();

      // testing ALL methods
      System.out.printf("Displaying getName method: \t\t%s\n", herRectangle.getName());
      System.out.printf("Displaying getWidth method: \t\t%s\n", herRectangle.getWidth());
      System.out.printf("Displaying getHeight method: \t\t%s\n", herRectangle.getHeight());
      System.out.printf("Displaying getArea method: \t\t%s\n", herRectangle.getArea());
      System.out.printf("Displaying getPerimeter method: \t%s\n", herRectangle.getPerimter());
      System.out.println();

      // END herRectangle-----------------------

      // sentinel checking
      System.out.print("Do you want to do it again? (Y to continue): ");
      sentinelResponse = scan.nextLine().toUpperCase().trim();
      System.out.println();
    }

    // cleanup
    scan.close();
  }

}
