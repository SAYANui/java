public class ArmStrong1{
    public static void main(String[] args) {
        int num = 1634;

        // Convert to String just to quickly get the number of digits
        int digits = String.valueOf(num).length();

        int temp = num;
        int totalSum = 0;

        // Loop to extract digits and calculate their power
        while (temp > 0) {
            int rem = temp % 10;

            // Math.pow returns a double, so we cast it to an int (int)
            totalSum += (int) Math.pow(rem, digits);

            temp = temp / 10;
        }

        // Check and print the result
        if (totalSum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}