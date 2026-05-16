public class shadow {

    static int a=50; // no error because it in block and use static to use it without creating a class//
public static void main(String[]args){
    System.out.println("now for first time a's value:"+a); // the value of a now is 50 //
int a=100; // it not give any error as per the block rule (It don't  know about   variable a ) //
    System.out.println("now 2nd time the value is :" +a); // now the value will be 100 after new initialization //
    // this is example of shadowing because it shadowed the  first a !!!!!!!!!!!!!!!
}


}
