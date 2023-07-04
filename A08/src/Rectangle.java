// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 8
// IDE Name: VS Code

@SuppressWarnings("unused")

public class Rectangle {

  private double width;
  private double height;

  public Rectangle() {
    width = 1.0;
    height = 1.0;
  }

  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return (height * width);
  }

  public double getPerimter() {
    return ((2 * height) + (2 * width));
  }

  public void toString(String rectangleName) {
    System.out.printf("Rectangle %s is %d units wide and %d units high.", rectangleName, width, height);

  }
}