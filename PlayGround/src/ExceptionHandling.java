public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException (divide by zero)
            System.out.println("Result: " + result); // This line will be skipped
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        } finally {
            System.out.println("This 'finally' block always runs, closing resources...");
        }

        System.out.println("The program continues running safely!");
    }
}
