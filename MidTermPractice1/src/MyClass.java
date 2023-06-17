public class MyClass {
  public static int x = 10;
  public int y = 20;

  public static void main(String[] args) {
    MyClass obj1 = new MyClass();
    MyClass obj2 = new MyClass();

    obj1.x = 5;
    obj2.y = 15;

    System.out.println(obj1.x + " " + obj1.y);
    System.out.println(obj2.x + " " + obj2.y);
  }
}
