package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

public class Q2_TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 7, 9 };
		int[] result = Solution1.twoSum(nums, 9);
		System.out.println(Arrays.toString(result));
	}

}

class Solution1 {
	
	//O(n2)
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] != target) {
				} else {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
	
	// O(n)
	public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if (prevMap.containsKey(diff)) {
                return new int[]{ prevMap.get(diff), i };
            }
            prevMap.put(nums[i], i);
        }
        return new int[0]; // Guranteed solution, no need for return
    }
}
