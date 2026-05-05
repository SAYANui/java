import java.util.Scanner; // Import the Scanner class

public class Age {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = myObj.nextLine();
        System.out.println("Enter your birth year (e.g., 1995):");
        // Read integer input
        int birthYear = myObj.nextInt();
        int age = 2026 - birthYear;
        System.out.println("-------------*--------------");
        System.out.println("Hello " + name + "!");
        System.out.println("By the end of 2026, you will be " + age + " years old.");
        myObj.close();
    }
}