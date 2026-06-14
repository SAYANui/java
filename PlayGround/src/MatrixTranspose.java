/*
Given a 2D array (matrix), we want to "flip" it over its diagonal. This means its rows become columns, and its columns become rows.

For example:

Plaintext
Original Matrix (3x2):
1  2
3  4
5  6

Transposed Matrix (2x3):
1  3  5
2  4  6
 */

public class MatrixTranspose {
    public static void main(String[] args) {
        // 1. Define and initialize a 2D array (3 rows, 2 columns)
        int[][] original = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int rows = original.length;        // 3
        int columns = original[0].length;  // 2

        // 2. Create a new 2D array with swapped dimensions (2 rows, 3 columns)
        int[][] transposed = new int[columns][rows];

        // 3. Nested loops to perform the transposition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // The magic happens here: row and column indices are swapped
                transposed[j][i] = original[i][j];
            }
        }

        // 4. Print the results
        System.out.println("--- Original Matrix ---");
        printMatrix(original);

        System.out.println("\n--- Transposed Matrix ---");
        printMatrix(transposed);
    }

    // Helper method to print a 2D array beautifully
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "   ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}