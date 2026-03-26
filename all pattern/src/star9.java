public class star9 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'E':
                // 1. Full left vertical spine (j == 0)
                // 2. Top and Bottom bars (i == 0 or i == height - 1)
                // 3. Middle bar (i == height / 2), slightly shorter (j < width - 1)

                boolean isSpine = (j == 0);
                boolean isTopBottom = (i == 0 || i == height - 1);
                boolean isMiddle = (i == height / 2) && (j < width - 1);

                if (isSpine || isTopBottom || isMiddle) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}