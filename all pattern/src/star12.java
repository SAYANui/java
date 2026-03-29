public class star12 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'H':
                // 1. Full left vertical spine (j == 0)
                // 2. Full right vertical spine (j == width - 1)
                // 3. Horizontal bridge exactly in the middle (i == height / 2)

                boolean isLeftSpine = (j == 0);
                boolean isRightSpine = (j == width - 1);
                boolean isBridge = (i == height / 2);

                if (isLeftSpine || isRightSpine || isBridge) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}