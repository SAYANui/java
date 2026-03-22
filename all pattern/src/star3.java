public class star3 {
    public static void main(String[] args) {
        int width = 10;
        int height = 5;

        // Outer loop for Rows
        for (int i = 0; i < height; i++) {

            // Inner loop for Columns
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }

            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}