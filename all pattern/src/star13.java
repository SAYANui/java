public class star13 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'I':
                // 1. Top bar (first row: i == 0)
                // 2. Bottom bar (last row: i == height - 1)
                // 3. Middle vertical spine (middle column: j == width / 2)

                boolean isTop = (i == 0);
                boolean isBottom = (i == height - 1);
                boolean isSpine = (j == width / 2);

                if (isTop || isBottom || isSpine) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}