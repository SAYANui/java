public class shadow {

    static int a=50; // no error because it in block and use static to use it without creating a class//
public static void main(String[]args){
    System.out.println("now for first time a's value:"+a); // the value of a now is 50 //
int a=100; // it not give any error as per the block rule (It don't  know about   variable a ) //
    System.out.println("now 2nd time the value is :" +a); // now the value will be 100 after new initialization //
    // this is example of shadowing because it shadowed the  first a !!!!!!!!!!!!!!!



    {
        int b= 20; // int b initialized  between  "parenthesis{}" it in the block
        System.out.println("now the first  value of b is :" +b); // the value  of b now 20//
    }

    int b=80; // again b is declared after the block initialized with 80 //
    System.out.println("now the second value of b is :" +b); // The value of b now is 80 , It shadowed the inner b


}


}
