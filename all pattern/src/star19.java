public class star19 {
    public static void main(String[] args) {
        int height = 7;
        int width = 7;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for a rounded 'O':
                // 1. Top and Bottom bars (but not at the corners)
                // 2. Left and Right vertical spines (but not at the corners)

                boolean isTopBottom = (i == 0 || i == height - 1) && (j > 0 && j < width - 1);
                boolean isLeftRight = (j == 0 || j == width - 1) && (i > 0 && i < height - 1);

                if (isTopBottom || isLeftRight) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}