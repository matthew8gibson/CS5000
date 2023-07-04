// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 8
// IDE Name: VS Code

import java.util.Scanner;

public class TestRectangle {

  public static void main(String[] args) {
    // setup
    String rectangleName;
    double height, width;
    Scanner scan = new Scanner(System.in);

    // user input (one cycle)
    System.out.print("name the rectangle:\t");
    rectangleName = scan.nextLine();

    System.out.println("Height:\t\t");
    height = scan.nextDouble();
    scan.nextLine();

    System.out.println("Width:\t\t");
    width = scan.nextDouble();
    scan.nextLine();

    Rectangle myRectangle = new Rectangle(height, width);

    // cleanup
    scan.close();
  }

  private double PromptDouble(String prompt, char promptType) {

    System.out.print(prompt + ":\t");
    switch (promptType) {
      case 'd':

        break;
      case 's':

        break;
      case 'i':

        break;

      default:
        break;
    }
  }

}