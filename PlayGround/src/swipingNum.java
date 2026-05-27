public class swipingNum {

public static void main(String[]args){


    int a=4,b=9;
    int temp=a;
    a=b;
    b=temp;
    System.out.println(a+","+b);

    int a1=4,b1=9;
    int temp1=a1+b1;
    a1=temp1-a1;
    b1=temp1-b1;
    System.out.println(a1+","+b1);


    int a2 = 4, b2 = 9;
    a2 = a2 ^ b2;
    b2 = a2^ b2;
    a2= a2 ^ b2;
    System.out.println(a2 + "," + b2);


    int a3 = 4, b3 = 9;
    a3 = a3 * b3;
    b3 = a3 / b3;
    a3 = a3 / b3;
    System.out.println(a3 + "," + b3);









}
}
