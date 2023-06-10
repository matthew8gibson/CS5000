// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  4
// IDE Name:    VS Code

public class Pattern {
  public static void main(String[] args) {
    // setup/input section
    int rows = 6;

    // output section
    // space at the beginning
    System.out.println();

    for (int i = rows; i >= 1; i--) { // counting down

      // spaces to move number to the right
      for (int j = 1; j <= rows - i; j++) { // counting up
        System.out.print("\t");
      }

      // numbers
      for (int k = 1; k <= i; k++) {
        System.out.print("\t" + k);
      }

      System.out.println(); // move to the next line
    }

    // cleanup section, any resources to close? -- nope!
  }
}
