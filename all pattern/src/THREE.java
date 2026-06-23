public class THREE {
    public static void main(String[] args) {
        int height = 7; // Total rows (best if odd for a perfectly centered middle)
        int width = 5;  // Total columns

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print horizontal lines at the top, middle, and bottom
                if (i == 0 || i == height / 2 || i == height - 1) {
                    System.out.print("*");
                }
                // Print the vertical line on the far right
                else if (j == width - 1) {
                    System.out.print("*");
                }
                // Print spaces everywhere else
                else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}