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
  private String name;

  public Rectangle() {
    width = 1.0;
    height = 1.0;
  }

  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String toString() {
    return String.format("Rectangle %s is %f units wide and %f units high.\n", name, width, height);
  }

  public static void DisplayRectangle(Rectangle printRectangle) {
    System.out.println();
    System.out.printf("%s:\n", printRectangle.getName());
    System.out.println("----------------");
    System.out.printf("Width:\t\t%s\n", String.format("%.2f", printRectangle.getWidth()));
    System.out.printf("Height:\t\t%s\n", String.format("%.2f", printRectangle.getHeight()));
    System.out.printf("Area:\t\t%s\n", String.format("%.2f", printRectangle.getArea()));
    System.out.printf("Perimter:\t%s\n", String.format("%.2f", printRectangle.getPerimter()));
    System.out.println();
  }
}