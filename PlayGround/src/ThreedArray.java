import java.util.Arrays;

public class ThreedArray {
    public static void main(String[] args) {

        // 1. Declare and initialize a 3D array: [2 pages][3 rows][4 columns]
        int[][][] booklet = {
                // Page 0
                {
                        {10, 11, 12, 13}, // Row 0
                        {14, 15, 16, 17}, // Row 1
                        {18, 19, 20, 21}  // Row 2
                },
                // Page 1
                {
                        {22, 23, 24, 25}, // Row 0
                        {26, 27, 28, 29}, // Row 1
                        {30, 31, 32, 33}  // Row 2
                }
        };

        // 2. Accessing a specific single value
        // Let's get the value on Page 1, Row 2, Column 3 (should be 33)
        int specificValue = booklet[1][2][3];
        System.out.println("Value at booklet[1][2][3]: " + specificValue);
        System.out.println("-------------------------------------------");

        // 3. Printing the entire 3D array using deepToString()
        System.out.println("All data (Single Line):");
        System.out.println(Arrays.deepToString(booklet));
        System.out.println("-------------------------------------------");

        // 4. Looping through the 3D array to print it like a book
        System.out.println("All data (Formatted Layout):");

        for (int page = 0; page < booklet.length; page++) {
            System.out.println("--- PAGE " + page + " ---");

            for (int row = 0; row < booklet[page].length; row++) {
                for (int col = 0; col < booklet[page][row].length; col++) {
                    // Print items side-by-side with a space
                    System.out.print(booklet[page][row][col] + " ");
                }
                System.out.println(); // New line after each row finishes
            }
            System.out.println(); // Extra new line between pages
        }
    }
}