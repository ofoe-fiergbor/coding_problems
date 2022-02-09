import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int expectedDifference;

        Map<Integer, Integer> tempMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            expectedDifference = target - nums[i];
            if (tempMap.containsKey(expectedDifference)) {
                return new int[]{tempMap.get(expectedDifference), i};
            }
            tempMap.put(nums[i], i);
        }
        return null;
    }
}
