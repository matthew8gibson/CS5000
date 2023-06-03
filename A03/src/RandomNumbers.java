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
    requirement1 = 20 + (int) (Math.random() * 61);
    // b) A random integer number between -20 and 20 (inclusive).
    requirement2 = -20 + (int) (Math.random() * 41);
    // c) A random integer number between -50 and -20 (inclusive).
    requirement3 = -50 + (int) (Math.random() * 31);
    // d) A random floating-point number between 0.0 and 21.9999 (inclusive).
    requirement4 = (float) ((Math.random() * 21.999f)); // BUG: 21.99 will not get hit!

    // debugging section, disable by setting to false
    boolean showDetails = false;
    if (showDetails) {
      // if (requirement2 == -20 || requirement2 == 20){
      // if (requirement3 == -50 || requirement3 == -20){
      if (requirement4 == 0.0f || requirement4 == 21.999f) {
        // if (requirement1 == 20 || requirement1 == 80) {

        System.out.println();
        System.out.println("testing**************" + requirement1 + " "
            + requirement2 + " " + requirement3 + " " + requirement4);
        System.out.println();
      }
    }

    // output section
    System.out.println();
    System.out.println("a) A random integer between 20 and 80 (inclusive):\t" + requirement1);
    System.out.println("b) A random integer number between -20 and 20 (inclusive):\t" + requirement2);
    System.out.println("c) A random integer number between -50 and -20 (inclusive):\t" + requirement3);
    System.out.println("d) A random floating-point number between 0.0 and 21.9999 (inclusive);\t" + requirement4);
    // cleanup section, any resources to close?
  }
}
