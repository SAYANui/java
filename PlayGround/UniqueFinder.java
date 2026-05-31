public class UniqueFinder {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1, 2};
        System.out.println("The unique number is: " + findSingleNumber(numbers)); // Outputs 4
    }
}