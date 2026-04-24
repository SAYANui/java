public class star27 {
    public static void main(String[] args) {
        int n = 7; // Height and width

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Logic for 'W':
                // 1. Left and Right vertical legs (j == 0 and j == n-1)
                // 2. The upward diagonal V-shape (only in the bottom half: i >= n/2)
                //    - Left slant: i + j == n - 1
                //    - Right slant: i == j

                boolean isLegs = (j == 0 || j == n - 1);
                boolean isCenterV = (i >= n / 2) && (i + j == n - 1 || i == j);

                if (isLegs || isCenterV) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}