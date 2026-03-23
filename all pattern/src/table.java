public class table  {
    public static void main(String[] args) {
        int number = 99;

        System.out.println("Multiplication Table of " + number);
        System.out.println("-------------------------------");

        for (int i = 1; i <= 10; i++) {
            // %2d ensures the multiplier (1-10) takes 2 spaces
            // %4d ensures the result takes 4 spaces for alignment
            System.out.printf("%d x %2d = %4d%n", number, i, number * i);
        }

        System.out.println("-------------------------------");
    }
}