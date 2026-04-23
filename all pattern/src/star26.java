public class star26 {
    public static void main(String[] args) {
        int n = 7; // Height of the letter

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n); j++) {
                // Logic for 'V':
                // 1. Left diagonal: j == i
                // 2. Right diagonal: j == 2 * n - 2 - i

                boolean isLeftSlant = (j == i);
                boolean isRightSlant = (j == 2 * n - 2 - i);

                if (isLeftSlant || isRightSlant) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}