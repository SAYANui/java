import java.util.Scanner;


public class Calculater {

public static void main(String[]args){

    Scanner in=new Scanner(System.in);

    double ans=0;
    while(true) {     // taking all input in between while is true (means it will run forever util break hits //
        System.out.print("Enter first number :");
        double a = in.nextDouble();
        System.out.print("Enter second number :");
        double b = in.nextDouble();
        System.out.print("enter the operation:");
        char num = in.next().trim().charAt(0);      // taking all the inputs and print texts


       if(num =='+' || num=='*' || num =='-'|| num=='/'|| num=='%' ){ // first if statement that check all operator
// input is true , if true next task will perform and get the "ans " //
           if (num=='+'){
               ans=a+b;
           }
else if(num=='*'){
    ans=a*b;
           }
else if(num=='/') {
    if (b!=0) {
        ans = a/b;
    }
           }
else if(num=='%') {
    ans = a % b;
           }
else if(num=='-') {
    ans = a-b;
           }
        System.out.println("\nthe ans is :"+ ans);
        System.out.println("*******************************************************************\n");
    }
       else if(num=='X'|| num=='x'){       // related to main if statement for break if the operator is X or x//
           break;
       }
       else  {

           // if the operator is somthing else like L or h or etc its print invalid //
           System.out.println("**********      invalid request     ************\n enter again ..............");
       }
    }
}

}
