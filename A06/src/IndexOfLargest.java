// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  6
// IDE Name:    VS Code

/**
 * IndexOfLargest
 */
public class IndexOfLargest {
  public static void main(String[] args) {

  }

  public static int findIndex(int[] inputArray) {
    int idxOfLargest = 0;
    int largest = inputArray[0];

    // loop through the array and save the value
    for (int i = 0; i < inputArray.length; i++) {
      if (largest < inputArray[i]) {
        idxOfLargest = i;
        largest = inputArray[i];
      }
    }

    return idxOfLargest;
  }
}