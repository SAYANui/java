import java.util.Arrays;
import java.util.Scanner;
public class Arrayinput{

    public static void main(String[]args){
        Scanner input= new Scanner(System.in);


        String[] arr= new String[5];
        for(int b=0;b<arr.length;b++){
            arr[b]=input.next();
        }
        System.out.print(Arrays.toString(arr));




    }
}

