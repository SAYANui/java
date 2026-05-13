/*
import java.util.Scanner;

public class RevNum {


    public static void main(String[] args) {

        while (true) {
         System.out.print("enter the number you want to reverse:");
         Scanner input=new Scanner(System.in);
         String num1=input.nextLine().trim();
            if(num1=="x"||num1=="X"){
                break;
            }
         int num=Integer.parseInt(num1);

            int ans = 0;


            for (; num > 0; num /= 10) {
                int rem = num % 10;

                ans = ans * 10 + rem;


            }
            System.out.println("\nthe reveres number is: " + ans+"\n");


        }
    }
}
*/


import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        // Create scanner once outside the loop
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number you want to reverse (or 'x' to exit): ");
            String num1 = input.nextLine().trim();

            // Use .equalsIgnoreCase for string comparison
            if (num1.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int num = Integer.parseInt(num1);
                int ans = 0;

                for (; num > 0; num /= 10) {
                    int rem = num % 10;
                    ans = ans * 10 + rem;
                }
                System.out.println("The reversed number is: " + ans + "\n");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x'.\n");
            }
        }
        input.close();
    }
}