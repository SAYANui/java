public class star31 {

        public static void main(String[] args) {
            int n = 9; // Height of the pyramid

            for (int i = 1; i <= n; i++) {
                // Loop for printing leading spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Loop for printing the numbers followed by a space
                for (int k = 1; k <= i; k++) {
                    System.out.print(i + " ");
                }

                // Move to the next line
                System.out.println();
            }
        }
    }
