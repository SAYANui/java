public class one {
    public static void main(String[] args) {
        int height = 9; // Total height of the number 1
        int width = 7;  // Total width for the base

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Condition for the top hook/cap of the 1
                if (i == 1 && (j == 2 || j == 3)) {
                    System.out.print("*");
                }
                // Condition for the main vertical stem (centered at column 3)
                else if (j == 3 && i < height - 1) {
                    System.out.print("*");
                }
                // Condition for the solid base at the very bottom row
                else if (i == height - 1) {
                    System.out.print("*");
                }
                // Fill the rest with spaces
                else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}