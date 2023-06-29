// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  7
// IDE Name:    VS Code

import java.util.Scanner;

public class MatrixAddition {

  public static void main(String[] args) {

    // setup sentinel
    Scanner scan = new Scanner(System.in);
    String sentinelValue = "Y";
    String sentinelResponse = "Y";

    // setup
    int rows = 3, columns = 3;
    int[][] matrixA = new int[rows][columns];
    int[][] matrixB = new int[rows][columns];

    // true lets you test with random numbers
    // rather than have to enter numbers every time
    Boolean autoPopulateMatrixes = false;

    while (sentinelResponse.equals(sentinelValue)) {
      if (autoPopulateMatrixes) {
        PopulateMatrixes(matrixA);
        PopulateMatrixes(matrixB);
      } else {
        // end-user entering matrix values
        System.out.println();
        System.out.print("Please enter 9 integers for Matrix A:\t");
        for (int i = 0; i < matrixA.length; i++) {
          for (int j = 0; j < matrixA.length; j++) {
            matrixA[i][j] = scan.nextInt();
          }
        } // end of for loop collecting numbers
        scan.nextLine(); // clear any extra entries
        System.out.println();
        System.out.print("Please enter 9 integers for Matrix B:\t");
        for (int i = 0; i < matrixB.length; i++) {
          for (int j = 0; j < matrixB.length; j++) {
            matrixB[i][j] = scan.nextInt();
          }
        } // end of for loop collecting numbers
        scan.nextLine(); // clear any extra entries
      }
      // show content of Matrixes
      System.out.println();
      PrintMatrix("Matrix A:", matrixA);
      PrintMatrix("Matrix B:", matrixB);

      // Add the matrixes and print them
      add(matrixA, matrixB);
      // sentinel checking
      System.out.print("Do you want to do it again? (Y to continue): ");
      sentinelResponse = scan.nextLine().toUpperCase().trim();
    }

    scan.close();
  }

  public static void PopulateMatrixes(int[][] inputMatrix) {
    // populated both Matrix with random number
    // created to testing to save time
    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix.length; j++) {
        inputMatrix[i][j] = (int) (Math.random() * 4);
      }
    }
  }

  public static void PrintMatrix(String header, int[][] inputMatrix) {
    System.out.println(header);
    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix.length; j++) {
        System.out.print("   " + inputMatrix[i][j] + "    ");
      }
      System.out.println();// new row.
    }
    System.out.println();
  }

  public static void add(int[][] inputMatrix1, int[][] inputMatrix2) {
    // figuring out the size of the matrix
    int rows = inputMatrix1.length;
    int columns = inputMatrix2.length;

    // new destination matrix
    int[][] matrixAPlusB = new int[rows][columns];

    // adding them
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrixAPlusB[i][j] = inputMatrix1[i][j] + inputMatrix2[i][j];
      }
    }

    // print the new 'sum' matrix
    PrintMatrix("Matrix A+B:", matrixAPlusB);
  }

}