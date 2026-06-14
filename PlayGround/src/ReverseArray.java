import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 8};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Call the method to reverse the array
        reverse(numbers);

        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }

    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Loop until the two pointers meet in the middle
        while (start < end) {
            // Swap the elements at 'start' and 'end'
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers closer to the center
            start++;
            end--;
        }
    }
}