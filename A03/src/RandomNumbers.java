// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  3
// IDE Name:    VS Code

public class RandomNumbers {
  public static void main(String[] args) {
    // setup/input section
    // wrapper to optionally skip prompt, if cmdline parameter is entered.
    int requirement1, requirement2, requirement3;
    float requirement4;

    // processing section
    // a) A random integer number between 20 and 80 (inclusive).
    requirement1 = 20 + (int) (Math.random() * 60);
    // b) A random integer number between -20 and 20 (inclusive).

    // c) A random integer number between -50 and -20 (inclusive).

    // d) A random floating-point number between 0.0 and 21.9999 (inclusive).

    // output section
    System.out.println();
    System.out.println("a) A random integer between 20 and 80 (inclusive):\t" + requirement1);

    // cleanup section, any resources to close?
  }
}
