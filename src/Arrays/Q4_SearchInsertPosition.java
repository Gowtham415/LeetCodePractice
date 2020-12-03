package Arrays;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

 */


public class Q4_SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        int index = Solution4.searchInsert(nums,6);
        System.out.println(index);
    }
}

class Solution4 {
    public static int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if(nums[i] == target || nums[i]>target)
                return i;
        }
        return nums.length;
    }
}