public class star21{
    public static void main(String[] args) {
        int n = 7; // Size of the letter

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Logic for 'Q':
                // 1. The main circle (O shape)
                // 2. The diagonal tail (starting from the bottom-right quadrant)

                boolean isTopBottom = (i == 0 || i == n - 2) && (j > 0 && j < n - 2);
                boolean isLeftRight = (j == 0 || j == n - 2) && (i > 0 && i < n - 2);
                boolean isTail = (i == j) && (i >= n / 2);

                if (isTopBottom || isLeftRight || isTail) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}