public class TWO {
    public static void main(String[] args) {
        int rows = 7;
        int columns = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Condition 1: Print top, middle, and bottom horizontal lines
                if (i == 0 || i == rows / 2 || i == rows - 1) {
                    System.out.print("*");
                }
                // Condition 2: Print the upper-right vertical line
                else if (i < rows / 2 && j == columns - 1) {
                    System.out.print("*");
                }
                // Condition 3: Print the lower-left vertical line
                else if (i > rows / 2 && j == 0) {
                    System.out.print("*");
                }
                // Otherwise, print a space
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}