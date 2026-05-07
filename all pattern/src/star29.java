public class star29 {
    public static void main(String[] args) {
        int n = 7; // Use an odd number for a perfect center intersection
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Logic for 'Y':
                // 1. Top V-shape (only for i <= mid)
                // 2. Vertical tail (only for i > mid at the center)

                boolean isVTop = (i <= mid) && (i == j || i + j == n - 1);
                boolean isTail = (i > mid) && (j == mid);

                if (isVTop || isTail) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}