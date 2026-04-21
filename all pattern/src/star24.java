public class star24 {
    public static void main(String[] args) {
        int height = 7;
        int width = 5; // Best with an odd number to have a perfect center

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for 'T':
                // 1. Full top horizontal bar (i == 0)
                // 2. Middle vertical spine (j == width / 2)

                boolean isTop = (i == 0);
                boolean isSpine = (j == width / 2);

                if (isTop || isSpine) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}