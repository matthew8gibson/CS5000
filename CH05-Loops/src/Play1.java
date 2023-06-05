
public class Play1 {

  public static void main(String[] args) throws Exception {

    System.out.println("Hello, World!");

    int x = 0;
    while (x != 0) { // if the condition is initially false, it will not run at all
      System.out.println("X is: " + x);
      ++x;

    }

    int y = 0;
    do { // runs one time even if condition is false.
      System.out.println("Y is: " + y);
      // ++y;
    } while (y != 0);

  }

}