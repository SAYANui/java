public class star14 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'J':
                // 1. Top horizontal bar (i == 0)
                // 2. Middle vertical spine (j == width / 2)
                // 3. Bottom curve/hook (last row, but only on the left side)
                // 4. Small vertical tip of the hook (last few rows on column 0)

                boolean isTop = (i == 0);
                boolean isSpine = (j == width / 2) && (i < height - 1);
                boolean isBottom = (i == height - 1) && (j > 0 && j < width / 2);
                boolean isHookTip = (j == 0) && (i > height / 2 && i < height - 1);

                if (isTop || isSpine || isBottom || isHookTip) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}