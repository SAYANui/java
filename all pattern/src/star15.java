public class star15 {
    public static void main(String[] args) {
        int height = 7; // Best with an odd number
        int width = 5;
        int mid = height / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'K':
                // 1. Full left vertical spine (j == 0)
                // 2. The diagonal arms:
                //    - Top arm: j == mid - i
                //    - Bottom arm: j == i - mid

                boolean isSpine = (j == 0);
                boolean isTopArm = (i <= mid) && (j == mid - i);
                boolean isBottomArm = (i > mid) && (j == i - mid);

                if (isSpine || isTopArm || isBottomArm) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}