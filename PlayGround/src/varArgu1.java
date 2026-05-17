public class varArgu1 {

    static void main(String[]args) {


               System.out.println(sum(4,4));
                System.out.println("Sum: " + sum(1, 2, 3, 4, 5)); // Outputs 15
        }




        // Method using a traditional for loop instead of a for-each loop
        public static int sum(int... numbers) {
            int total = 0;

            // i starts at 0 (the first index) and goes up to the array's length minus 1
            for (int i = 0; i < numbers.length; i++) {
                int n = numbers[i]; // Fetching the number at index i
                total += n;        // Adding it to the total
            }

            return total;
        }


    }

