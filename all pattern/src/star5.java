public class star5 {
    public static void main(String[] args) {
        int height = 10; // You can change this to make the 'A' bigger or smaller
        int width = (2 * height) - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Condition for the two slanted sides
                // and the horizontal bar in the middle (at height/2)
                if (j == height - i - 1 || j == height + i - 1 || (i == height / 2 && j > height - i - 1 && j < height + i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}