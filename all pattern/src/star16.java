public class star16 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'L':
                // 1. Full left vertical spine (j == 0)
                // 2. Full bottom horizontal bar (i == height - 1)

                boolean isSpine = (j == 0);
                boolean isBottom = (i == height - 1);

                if (isSpine || isBottom) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}