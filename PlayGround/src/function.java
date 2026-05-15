import java.util.Scanner;

public class function {



    public static void main (String[]args){

        Scanner input =new Scanner(System.in);
        System.out.print("enter first number:");
        int a=input.nextInt();
        System.out.print("enter the second number:");
        int b=input.nextInt();
        sum(a,b);

    }
    static void sum(int a,int b){

        int sum=a+b;
        System.out.println("\n the sum is:"+sum);
    }
}
