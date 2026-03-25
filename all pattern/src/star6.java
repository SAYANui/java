public class star6 {
    public static void main(String[] args) {
        int height = 7;
        int width = 4;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic for a slim B:
                // 1. Always print the first column (the spine)
                // 2. Print top, middle, bottom rows but stop before the last column
                // 3. Print the last column only on the 'curved' parts (rows 1, 2, 4, 5)

                boolean isSpine = (j == 0);
                boolean isHorizontal = (i == 0 || i == height / 2 || i == height - 1) && (j < width - 1);
                boolean isCurve = (j == width - 1) && (i != 0 && i != height / 2 && i != height - 1);

                if (isSpine || isHorizontal || isCurve) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}