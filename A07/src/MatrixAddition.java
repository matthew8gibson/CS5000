// Class:       CS 5000 / W01
// Term:        Summer 2023
// Name:        Matthew Gibson
// Instructor:  Dr. Haddad
// Assignment:  7
// IDE Name:    VS Code

public class MatrixAddition {

  public static void main(String[] args) {

    // setup
    int rows = 3, columns = 3;
    int[][] matrixA = new int[rows][columns];
    int[][] matrixB = new int[rows][columns];

    Boolean autoPopulateMatrixes = true;
    if (autoPopulateMatrixes) {
      PopulateMatrixes(matrixA);
      PopulateMatrixes(matrixB);
    } else {
      // prompt for populating the matrix, then sentinel loop
    }

    // show content of Matrixes
    System.out.println();
    PrintMatrix("Matrix A:", matrixA);
    PrintMatrix("Matrix B:", matrixB);

    // Add the matrixes and print them
    add(matrixA, matrixB);

  }

  public static void PopulateMatrixes(int[][] inputMatrix) {
    // populated both Matrix with random number
    // created to testing to save time
    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix.length; j++) {
        inputMatrix[i][j] = (int) (Math.random() * 10);
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