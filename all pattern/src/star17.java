public class star17 {
    public static void main(String[] args) {
        int n = 7; // Best with an odd number for a sharp center point

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Logic for 'M':
                // 1. Left and Right vertical legs (j == 0 and j == n-1)
                // 2. The diagonal V-shape (only in the top half: i <= n/2)
                //    - Left slant: i == j
                //    - Right slant: i + j == n - 1

                boolean isLegs = (j == 0 || j == n - 1);
                boolean isVShape = (i <= n / 2) && (i == j || i + j == n - 1);

                if (isLegs || isVShape) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}