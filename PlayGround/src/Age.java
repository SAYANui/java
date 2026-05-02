import java.util.Scanner; // Import the Scanner class

public class Age {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name:");
        // Read string input
        String name = myObj.nextLine();

        System.out.println("Enter your birth year (e.g., 1995):");
        // Read integer input
        int birthYear = myObj.nextInt();

        // Calculate age (assuming current year is 2026)
        int age = 2026 - birthYear;

        // Output the result
        System.out.println("---------------------------");
        System.out.println("Hello " + name + "!");
        System.out.println("By the end of 2026, you will be " + age + " years old.");

        // Good practice to close the scanner
        myObj.close();
    }
}