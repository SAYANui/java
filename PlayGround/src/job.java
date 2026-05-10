import java.util.Scanner;

public class job {

public static void main (String[]args){


    System.out.print("Enter a float:");
Scanner num=new Scanner(System.in);
float no=num.nextFloat(); // first have the value as no (floating number)//
System.out.println("you Entered :"+ no);
int no2=(int)no;// converted integer from float//
String no3=String.valueOf(no2);// here the value is string converted from integer//
int no4=Integer.parseInt(no3);// no4 is integer converted from string no3//
System.out.println("the integer value from your Float is  :"+no2);
System.out.println("your converted String is :"+ no3);
System.out.println("your converted int value from String :"+no4);

System.out.println("++++++++++++");

for (int a=0;a<=no4;a++) {

    System.out.println("your " + a + "th  number is :" + a);
    if (a >= 20) {
        break;
    }
}


}

}
