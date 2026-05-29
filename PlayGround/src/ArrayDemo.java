import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // 1. Declare and initialize an array
        int[] numbers = {12, 45, 7, 23, 56, 89, 34};

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("--------------------------------------");

        // 2. Accessing elements and finding the length
        System.out.println("Total number of elements: " + numbers.length);
        System.out.println("The first element is: " + numbers[0]);
        System.out.println("The last element is: " + numbers[numbers.length - 1]);
        System.out.println("--------------------------------------");

        // 3. Variables to store our calculations
        int sum = 0;
        int max = numbers[0]; // Start by assuming the first element is the largest

        // 4. Traverse the array using a standard for loop
        for (int i = 0; i < numbers.length; i++) {
            // Add current element to sum
            sum += numbers[i];

            // Check if current element is larger than our current max
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 5. Calculate average (cast sum to double for precision)
        double average = (double) sum / numbers.length;

        // 6. Display the results
        System.out.println("Sum of all elements: " + sum);
        System.out.printf("Average of elements: %.2f\n", average);
        System.out.println("The maximum value is: " + max);

        System.out.println("--------------------------------------");

        // 7. Bonus: Modifying an element and printing using a modern for-each loop
        numbers[2] = 99; // Changing the 3rd element (index 2) from 7 to 99
        System.out.println("Modified Array (printed using a for-each loop):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line
    }
}