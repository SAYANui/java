public class star25 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'U':
                // 1. Left and Right vertical spines (but skip the last row for rounding)
                // 2. Bottom horizontal bar (but skip the first and last columns for rounding)

                boolean isLeftRight = (j == 0 || j == width - 1) && (i < height - 1);
                boolean isBottom = (i == height - 1) && (j > 0 && j < width - 1);

                if (isLeftRight || isBottom) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}