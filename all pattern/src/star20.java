public class star20{
    public static void main(String[] args) {
        int height = 7;
        int width = 5;
        int mid = height / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'P':
                // 1. Full left vertical spine (j == 0)
                // 2. Top and Middle horizontal bars (i == 0 or i == mid)
                // 3. Right vertical bar, but only for the top half (j == width - 1)

                boolean isSpine = (j == 0);
                boolean isBars = (i == 0 || i == mid) && (j < width - 1);
                boolean isCurve = (j == width - 1) && (i > 0 && i < mid);

                if (isSpine || isBars || isCurve) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}