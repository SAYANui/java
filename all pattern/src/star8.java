public class star8 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for a rounded 'D':
                // 1. Full left vertical spine (j == 0)
                // 2. Top and Bottom bars, but stop before the last column (j < width - 1)
                // 3. Right vertical side, but skip the very top and bottom rows (i != 0 && i != height - 1)

                boolean isSpine = (j == 0);
                boolean isHorizontal = (i == 0 || i == height - 1) && (j < width - 1);
                boolean isCurve = (j == width - 1) && (i != 0 && i != height - 1);

                if (isSpine || isHorizontal || isCurve) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}