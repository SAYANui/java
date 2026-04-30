import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        // Prompt user for the second number
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        // Perform calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Addition:       " + sum);
        System.out.println("Subtraction:    " + difference);
        System.out.println("Multiplication: " + product);

        // Close the scanner
        input.close();
    }
}
