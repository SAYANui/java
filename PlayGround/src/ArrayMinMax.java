/*
Given an array of integers, find and print the largest and smallest numbers in that array
 */

public class ArrayMinMax {
    public static void main(String[] args) {
        // 1. Initialize a 1D array with some sample data
        int[] numbers = {15, 42, 3, 89, -5, 22, 0};

        // 2. Edge case check: Ensure the array is not empty
        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        // 3. Assume the first element is both the min and max initially
        int min = numbers[0];
        int max = numbers[0];

        // 4. Loop through the 1D array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current element is larger
            } else if (numbers[i] < min) {
                min = numbers[i]; // Update min if current element is smaller
            }
        }

        // 5. Print the results
        System.out.println("Source Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}