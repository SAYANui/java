
public class star30{
    public static void main(String[] args) {
        int size = 5; // You can change this number to make the 'Z' larger or smaller

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Condition to print stars:
                // 1. i == 0 (Top row)
                // 2. i == size - 1 (Bottom row)
                // 3. i + j == size - 1 (The diagonal line)
                if (i == 0 || i == size - 1 || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for empty areas
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}