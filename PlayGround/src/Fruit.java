import java.util.Scanner;

public class Fruit {

public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    System.out.print("enter the fruit name:");
    String fruit=in.nextLine().trim();


    /*
       switch(fruit){

        case "mango":
            System.out.print("\nking of fruit\n");
            break;
        case "apple":
            System.out.print("\ngood in taste but not great\n");
            break;
        case "banana":
            System.out.print("\nlook like but not it is !!\n");
            break;
        default:
            System.out.print("\nOI invalid fruit!!\n");
    }

     */
    switch (fruit) {
        case "mango" -> System.out.print("\nking of fruit\n");
        case "apple" -> System.out.print("\ngood in taste but not great\n");
        case "banana" -> System.out.print("\nlook like but not it is !!\n");
        default -> System.out.print("\nOI invalid fruit!!\n");
    }





}

}
