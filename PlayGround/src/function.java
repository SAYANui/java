import java.util.Scanner;

public class function {



    public static void main (String[]args){

        Scanner input =new Scanner(System.in);
        System.out.print("enter first number:");
        int a=input.nextInt();
        System.out.print("enter the second number:");
        int b=input.nextInt();

        // till now the a,b is the value taken by user and data type is integer //

        int ans=sub1(a,b); // sub1 function return the ans internally but, I have to keep it so initialise it in
                           // main function as a new int as ans
        System.out.println("\nthe substraction is:"+ans); // then print the """"ans""""//

        sum1(a,b); // just calling the sum1 function //

    }

    static int sub1(int a,int b){// here static key word is used because it's should usable  in main //
      int sub=(a-b);            // data type of the function is integer and the parameter is a and b; //
      return sub;             //  its return sub (int) internal code says its int matches the function return type

        // doesn't contain any print statement because it can't !!!!! ig

    }
    static void sum1(int a,int b){ // because void that's why its not return anything //

        int sum=a+b;  // simple addition //
        System.out.println("\n the sum is:"+sum); // printing sum
    }
}
