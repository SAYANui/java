public class star11 {
    public static void main(String[] args) {
        int height = 7;
        int width = 6;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'G':
                // 1. Top and Bottom curves (like 'C')
                // 2. Left vertical spine (middle section)
                // 3. The "Shelf" (horizontal bar in middle-right)
                // 4. The small right vertical bar at the bottom

                boolean isTopBottom = (i == 0 || i == height - 1) && (j > 0 && j < width - 1);
                boolean isLeftSpine = (j == 0) && (i > 0 && i < height - 1);
                boolean isShelf = (i == height / 2) && (j >= width / 2);
                boolean isRightBar = (j == width - 1) && (i > height / 2 && i < height - 1);

                if (isTopBottom || isLeftSpine || isShelf || isRightBar) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}