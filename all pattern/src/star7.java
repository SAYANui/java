public class star7{
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for a smooth 'C':
                // 1. Top and Bottom bars (but not at the very last column)
                // 2. Left vertical spine (but not at the very top or bottom corners)

                boolean isTopOrBottom = (i == 0 || i == height - 1) && (j > 0);
                boolean isLeftSpine = (j == 0) && (i > 0 && i < height - 1);

                if (isTopOrBottom || isLeftSpine) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}