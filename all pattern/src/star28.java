public class star28{
    public static void main(String[] args) {
        int n = 7; // Use an odd number for a perfect center intersection

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Logic for 'X':
                // 1. Diagonal from top-left to bottom-right (i == j)
                // 2. Diagonal from top-right to bottom-left (i + j == n - 1)

                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}