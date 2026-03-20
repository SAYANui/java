public class star2 {
    public static void main(String[] args) {
        int height = 10; // Height of the foliage

        // 1. Print the foliage (The Triangle)
        for (int i = 1; i <= height; i++) {
            // Print leading spaces to center the stars
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            // Print the stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Print the trunk
        // We'll make it 2 rows high and centered
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j < height; j++) {
                System.out.print(" ");
            }
            System.out.println("| |");
        }
    }
}