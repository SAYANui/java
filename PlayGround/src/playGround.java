import java.util.Arrays;

public class playGround {

public static void main(String[]args){
int[] a= {5,66,77,8};
System.out.println(Arrays.toString(a));
change(a);
System.out.print(Arrays.toString(a));

        }
        static void change(int[]arr){
    arr[3]=55;
        }


    }

