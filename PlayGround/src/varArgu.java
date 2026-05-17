public class varArgu {
public static void main(String[]args ){


    printNumbers(0);          // Valid: 0 arguments
    printNumbers(10);        // Valid: 1 argument
    printNumbers(1, 2, 3);   // Valid: 3 arguments



}

    public static void printNumbers(int... numbers) {
        // Inside the method, 'numbers' is treated as a regular array (int[])
        for (int num : numbers) {
            System.out.print("num="+num + ", ");
        }
    }



}
