public class star18 {
    public static void main(String[] args) {
        int n = 7; // Size of the letter

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Logic for 'N':
                // 1. Left vertical leg: j == 0
                // 2. Right vertical leg: j == n - 1
                // 3. Diagonal connecting them: i == j

                boolean isLegs = (j == 0 || j == n - 1);
                boolean isDiagonal = (i == j);

                if (isLegs || isDiagonal) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}