/* import java.util.HashMap;
import java.util.Map;

public class solution {
        public int[] twoSum(int[] nums, int target) {
            // Map to store: Key = Number value, Value = Its index
            Map<Integer, Integer> numMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                // If we've already seen the complement, we're done!
                if (numMap.containsKey(complement)) {
                    return new int[] { numMap.get(complement), i };
                }

                // Otherwise, store this number and its index in the map
                numMap.put(nums[i], i);
            }

            return new int[] {}; // Default return

    }

}
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class solution {
    // This is the logic you wrote (The "Worker")
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }

    // This is the "Main" method (The "Engine Start" button)
    public static void main(String[] args) {
        solution sol = new solution();

        // Test data
        int[] testNums = {2, 7, 11, 15};
        int target = 9;

        // Calling your function and printing the result
        int[] result = sol.twoSum(testNums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
