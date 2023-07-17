// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 10
// IDE Name: VS Code

public class Triangle extends GeometricObject {

      // private variables
      private double side1;
      private double side2;
      private double side3;
      private String name;

      public Triangle() { // default constructor
            side1 = 1.0;
            side2 = 1.0;
            side3 = 1.0;
            name = "myTriangle";
      }

      // constructor allowing to set the sides of the triangle
      public Triangle(double side1, double side2, double side3, String name) {

            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.name = name;
      }

      // Getting the sides 1, 2, and 3
      public double getSide1() {
            return side1;
      }

      public double getSide2() {
            return side2;
      }

      public double getSide3() {
            return side3;
      }

      // setting the sides 1, 2, and 3
      public void setSide1(double side1) {
            this.side1 = side1;
      }

      public void setSide2(double side2) {
            this.side2 = side2;
      }

      public void setSide3(double side3) {
            this.side3 = side3;
      }

      // calculating Area with Heron's Formula
      public double getArea() {
            double halfPerimeter = (side1 + side2 + side3) / 2.0;
            double area = Math.sqrt(halfPerimeter *
                        (halfPerimeter - side1) *
                        (halfPerimeter - side2) *
                        (halfPerimeter - side3));
            return area;
      }

      public double getPerimeter() {
            return side1 + side2 + side3;
      }

      public String toString() {
            String output = "Triangle:\t" + name + "\n";
            output += "Side 1:\t\t" + side1 + "\n";
            output += "Side 2:\t\t" + side2 + "\n";
            output += "Side 3:\t\t" + side3 + "\n";
            output += "Area:\t\t" + getArea() + "\n";
            output += "Perimeter:\t" + getPerimeter() + "\n";
            output += "Color:\t\t" + getColor() + "\n";
            output += "Is Filled:\t" + isFilled() + "\n";
            return output;
      }

}
