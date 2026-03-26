public class star10 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'F':
                // 1. Full left vertical spine (j == 0)
                // 2. Top bar (i == 0)
                // 3. Middle bar (i == height / 2)

                boolean isSpine = (j == 0);
                boolean isTop = (i == 0);
                boolean isMiddle = (i == height / 2) && (j < width - 1);

                if (isSpine || isTop || isMiddle) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}