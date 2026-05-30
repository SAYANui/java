import java.util.HashMap;
import java.util.Arrays;

public class LogicalPuzzle {

    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store: [Number -> Its Index]
        HashMap<Integer, Integer> memoryBank = new HashMap<>();

        // Loop through the array exactly once
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int requiredPartner = target - currentNum;

            // Logic Check: Have we already seen the required partner?
            if (memoryBank.containsKey(requiredPartner)) {
                // If yes, grab its index and the current index. Problem solved!
                return new int[] { memoryBank.get(requiredPartner), i };
            }

            // If no, memorize the current number and its index for future numbers
            memoryBank.put(currentNum, i);
        }

        // Return an empty array if no solution exists
        return new int[] {};
    }

    public static void main(String[] args) {
        // Test Data
        int[] numbers = {2, 7, 11, 15};
        int targetSum = 9;

        // Run the logic
        int[] result = findTwoSum(numbers, targetSum);

        // Print results
        if (result.length == 2) {
            System.out.println("Success! Indices found: " + Arrays.toString(result));
            System.out.println("Because nums[" + result[0] + "] + nums[" + result[1] + "] = " + targetSum);
        } else {
            System.out.println("No matching pair found.");
        }
    }
}