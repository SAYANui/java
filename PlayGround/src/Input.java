import java.util.Scanner;

public class Input {
    public static void main(String [] args ){
System.out.print("enter your Roll:" );
        Scanner input=new Scanner(System.in);
        int no=input.nextInt();
        System.out.print("write something:");
        Scanner inpu=new Scanner(System.in);
        String io=inpu.nextLine();
        System.out.print("write something in decimal:");
        Scanner num=new Scanner(System.in);
        double value=num.nextDouble();

        System.out.println("**************************************");

        System.out.println("your Roll is :" +no);
        System.out.println("you just write:"+ io);
        System.out.println("you just type the value:"+ value);
    }
}
