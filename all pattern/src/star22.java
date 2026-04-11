public class star22 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;
        int mid = height / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'R':
                // 1. Full left vertical spine (j == 0)
                // 2. Top and Middle horizontal bars (i == 0 or i == mid)
                // 3. Right curve for the top half (j == width - 1 && i < mid)
                // 4. The diagonal leg for the bottom half (j == i - mid)

                boolean isSpine = (j == 0);
                boolean isBars = (i == 0 || i == mid) && (j < width - 1);
                boolean isCurve = (j == width - 1) && (i > 0 && i < mid);
                boolean isLeg = (i > mid) && (j == i - mid);

                if (isSpine || isBars || isCurve || isLeg) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}