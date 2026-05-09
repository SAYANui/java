public class Typeconvo {
    public static void main(String[] args) {
String num="456";
int num1=Integer.parseInt(num);
        int myInt = 9;
        double myDouble = myInt;

        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + myInt);      // Outputs 9
        System.out.println("Double value: " + myDouble);    // Outputs 9.0

        System.out.println("-------------------------");

        // --- NARROWING CASTING (Manual) ---
        double pi = 3.14159;
        int roundedPi = (int) pi; // Manual casting: double to int

        System.out.println("Narrowing Casting:");
        System.out.println("Double value: " + pi);          // Outputs 3.14159
        System.out.println("Integer value: " + roundedPi);  // Outputs 3 (Fractional part lost)

        // --- TYPE PROMOTION IN EXPRESSIONS ---
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);
        System.out.println("-------------------------");
        System.out.println("Result of expression: " + result);
        System.out.println("the string num is:"+num);
        System.out.println("the converted string is:"+num1);


    }
}