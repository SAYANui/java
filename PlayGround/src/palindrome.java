public class palindrome {

    public static void main(String[]args){








palnum(5585);
palString("sayan");



    }

    static void palString(String str1){
        String str=str1;
String revstring="";
for ( int i=str.length()-1; i>=0;i--){

    revstring=revstring+str.charAt(i);

}
        System.out.println("the String is: "+revstring);

if (revstring.equals(str1)) {
System.out.println("It is Palindrome");
}else{
    System.out.println("Not Palindrome");
}

    }



    static void palnum(int realnum) {
        int num = realnum;
        int actualnum = 0;
        for (; num > 0; num = num / 10) {
            int rem = num % 10;

            actualnum = actualnum * 10 + rem;
        }
        System.out.println("the number is:"+actualnum);
        if (actualnum == realnum) {
            System.out.println(" The number is palindrome");
        } else {
            System.out.println(" The number is not palindrome");
        }
    }
}
