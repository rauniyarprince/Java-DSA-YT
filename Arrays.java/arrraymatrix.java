public class arrraymatrix {
  
}
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Rows and columns of first matrix: ");
        int rowsA = input.nextInt();
        int colsA = input.nextInt();

        System.out.print("Rows and columns of second matrix: ");
        int rowsB = input.nextInt();
        int colsB = input.nextInt();

        if (colsA != rowsB) {
            System.out.println("Cannot multiply: columns of the first matrix "
                    + "must equal rows of the second.");
            input.close();
            return;
        }

        int[][] a = new int[rowsA][colsA];
        int[][] b = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        System.ou{
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result:");
        printMatrix(result);

        input.close();
    }

    static void readMatrix(Scanner input, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}