
import java.util.Scanner;


public class CaseCheck {

public static void main(String[]args){


    System.out.print("type something in string :");
Scanner input1=new Scanner(System.in);
String input=input1.nextLine().trim();// here trim() is used to trim the side of string
char ch=input.charAt(0);//charAt() function to extract the individual char in a  string
System.out.println("after trim the String is:"+input);
System.out.println("the 0th char in the string is :"+ch);



}
}



