import java.util.Arrays;
import java.util.Scanner;
public class TwoDarrayin {

public static void main(String[]args){
    Scanner input =new Scanner(System.in);

    String[][] arr= new String[2][4];
    for (int a=0;a<arr.length;a++){
     for (int b=0;b<arr[a].length;b++){
       arr[a][b]=input.next();
     }
    }
    System.out.println(Arrays.deepToString(arr));
    input.close();

}
}
