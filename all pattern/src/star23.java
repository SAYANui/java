public class star23 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;
        int mid = height / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'S':
                // 1. Top, Middle, and Bottom horizontal bars
                // 2. Left vertical bar (Top half only)
                // 3. Right vertical bar (Bottom half only)

                boolean isBars = (i == 0 || i == mid || i == height - 1);
                boolean isTopLeft = (j == 0 && i < mid);
                boolean isBottomRight = (j == width - 1 && i > mid);

                if (isBars || isTopLeft || isBottomRight) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}