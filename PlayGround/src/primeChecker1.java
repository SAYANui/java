import java.util.Scanner;


public class primeChecker1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter tha number :");
        int click=in.nextInt();
        prime(click);





    }



    static void prime(int num){
        if (num<=1){
            System.out.println("neither a prime nor a composite");
            return ;
        }

        for(int n=2;n*n<=num;n++){
            if(num%n==0){
                System.out.println("The number is not prime number ");
                return;
            }
            else{
                System.out.println("The number is prime ");
                return;
            }
        }


    }




}
