
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
    // setup
    String rectangleName;
    double height, width;
    Scanner scan = new Scanner(System.in);

    // myRectangle is a default object. (i.e., uses default width and height)
    Rectangle myRectangle = new Rectangle();
    myRectangle.setName("myRectangle");
    // print it out
    System.out.println();
    System.out.println(myRectangle.toString());
    myRectangle.displaySummary();

    /*
     * // user input (one cycle)
     * Rectangle hisRectangle = new Rectangle();
     * System.out.println("Enter the name of the rectangle:\t\t"); // getting height
     * rectangleName = scan.nextLine();
     * System.out.printf("Enter the details for %sRectangle\n", rectangleName);
     * 
     * System.out.println("Height:\t\t"); // getting height
     * height = scan.nextDouble();
     * scan.nextLine(); // clear the line
     * 
     * System.out.println("Width:\t\t"); // getting width
     * width = scan.nextDouble();
     * scan.nextLine(); // clear the line
     * 
     * // Create objects
     * Rectangle myRectangle = new Rectangle(height, width);
     * 
     * // print it out
     * DisplayRectangle(myRectangle);
     */

    // cleanup
    scan.close();
  }

}