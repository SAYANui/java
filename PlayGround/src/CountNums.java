/*
import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        System.out.print("enter a number to find reminder:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.print("the number you want find:");
        Scanner input2=new Scanner(System.in);
        int num1=input2.nextInt();


        int loop=0;

        int rem=num%10;

        for(;num>0;){


           if (rem==6){
               System.out.print("its remind "+loop+" times....");
               loop++;
           }
           num=num/10;
        }
*/
import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the full number: ");
        long num = input.nextLong();

        System.out.print("Enter the digit you want to count: ");
        long targetDigit = input.nextLong();

        long count = 0;

        // We use a while loop or a for loop to strip digits one by one
        while (num > 0) {
            Long rem = num % 10; // Get the last digit

            if (rem == targetDigit) {
                count++;
            }

            num = num / 10; // Remove the last digit from the number
        }

        System.out.println("The digit " + targetDigit + " appeared " + count + " times.");
    }
}

/*
import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        System.out.print("enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.print("the digit you want to find:");
        int num1 = input.nextInt();

        int count = 0;

        // int rem = num % 10;  <-- WRONG: This was outside the loop.

        while (num > 0) {
            int rem = num % 10; // CORRECT: Put it inside so it updates.

            // if (rem == 6)    <-- WRONG: This only searched for '6'.
            if (rem == num1) {  // CORRECT: Compares to the user's input.
                count++;
            }
            num = num / 10;
        }

        System.out.print("It appeared " + count + " times.");
    }
}
 */



