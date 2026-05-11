import java.util.Scanner;

public class Fibonacci {

    public static void main(String[]args) {
        System.out.println("printing fibonacci numbers");
        System.out.print("the loop will run: ");
        Scanner input = new Scanner(System.in);
int loop=input.nextInt();
int fiba=0,fibb=1;
int num;

for(int c=1;c<=loop;c++){
   System.out.println("the number is "+ fiba);
   num=fiba+fibb;
   fiba=fibb;
   fibb=num;


}
    }
}
