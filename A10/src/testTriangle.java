// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 10
// IDE Name: VS Code

import java.util.Scanner;

//@SuppressWarnings("unused")

public class testTriangle {
    public static void main(String[] args) {

        // setup
        Scanner scan = new Scanner(System.in);
        String triangleName, triangleColor;
        double side1, side2, side3;
        Boolean isFilled;

        // Add Sentinel loop

        // Default Constructor Object - BEGIN
        Triangle myTriangle = new Triangle(); // sets default size 1 X 1 X 1
        myTriangle.setColor("red");
        myTriangle.setFilled(true);
        System.out.println();
        System.out.println("Default Constructor Triangle:");
        System.out.println(myTriangle.toString());

        // Default Constructor Object - END

        // User input Object - not default constructor - BEGIN

        // prompts
        System.out.println("Now, We're doing a custom triangle!  Woo Hoo!");
        System.out.print("What would you like to name it?\t");
        triangleName = scan.nextLine();
        Boolean valid = false;
        do {
            side1 = gatherPositiveDouble("What is length of side1?\t");
            side2 = gatherPositiveDouble("What is length of side2?\t");
            side3 = gatherPositiveDouble("What is length of side3?\t");
            valid = (isValidTriangle(side1, side2, side3));
            if (!valid) {
                System.out.println("Those 3 lengths cannot make a triangle. Try again.");
            }
        } while (!valid);

        System.out.print("What color ?\t\t\t");
        triangleColor = scan.nextLine();

        System.out.print("Is it Filled (true/false)?\t");
        isFilled = scan.nextBoolean();

        // create/update
        // test all of the class methods, including inherited methods setColor() and
        // setFilled(), on those 2 objects. Add proper and meaningful labels to your
        // outputs.
        Triangle theTriangle = new Triangle(side1, side2, side3, triangleName);
        theTriangle.setColor(triangleColor);
        theTriangle.setFilled(isFilled);

        // output 1 - as created
        System.out.println();
        System.out.println("Custom User Triangle, first version:");

        System.out.println(theTriangle.toString());

        // output 2 - as updated
        System.out.println();
        System.out.println("Custom User Triangle, second version (each side is twice as big):");
        System.out.println("\tnote: this update allows us to use all methods");
        // the point of these 3 lines is to meet project requirements of:
        // "test all class methods"
        theTriangle.setSide1(side1 * 2);
        theTriangle.setSide2(side2 * 2);
        theTriangle.setSide3(side3 * 2);
        System.out.println(theTriangle.toString());

        // User input Object - not default constructor - END

        // cleanup
        scan.close();

    }

    private static double gatherPositiveDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        Double gatheredValue = 0.0;
        do {
            System.out.print(message);
            gatheredValue = scanner.nextDouble();
            scanner.nextLine(); // clear the line return
            if (!CheckPositive(gatheredValue)) {
                System.out.println("The value must be positive.");
            }
        } while (!CheckPositive(gatheredValue));

        // return the value
        return gatheredValue;
    }

    private static Boolean CheckPositive(double input) {
        if (input > 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        // found a test to confirm values can be a valid triangle
        // in testing, I found the function area would fail if the values would not
        // actually make a triangle
        boolean side3LongEnough = (side1 + side2 > side3);
        boolean side2LongEnough = (side1 + side3 > side2);
        boolean side1LongEnough = (side2 + side3 > side1);

        return side3LongEnough && side2LongEnough && side1LongEnough;
    }
}
