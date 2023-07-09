// Class: CS 5000 / W01
// Term: Summer 2023
// Name: Matthew Gibson
// Instructor: Dr. Haddad
// Assignment: 8
// IDE Name: VS Code

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
    return String.format("Rectangle %s is %.1f units wide and %.1f units high.\n", name, width, height);
  }

  public void displaySummary() {

    System.out.printf("%s:\n", name);
    System.out.println("----------------");
    System.out.printf("Width:\t\t%s\n", String.format("%.2f", width));
    System.out.printf("Height:\t\t%s\n", String.format("%.2f", height));
    System.out.printf("Area:\t\t%s\n", String.format("%.2f", getArea()));
    System.out.printf("Perimter:\t%s\n", String.format("%.2f", getPerimter()));
    System.out.println();
  }
}