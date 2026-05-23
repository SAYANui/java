public class palindrome {

    public static void main(String[]args){








palnum(555);



    }

    static void palnum(int realnum) {
        int num = realnum;
        int actualnum = 0;
        for (; num > 0; num = num / 10) {
            int rem = num % 10;

            actualnum = actualnum * 10 + rem;
        }
        if (actualnum == realnum) {
            System.out.println(" The number is palindrome");
        } else {
            System.out.println(" The number is not palindrome");
        }
        System.out.println(actualnum);
    }
}
