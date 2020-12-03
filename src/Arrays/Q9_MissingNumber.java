package Arrays;
/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
Example 4:

Input: nums = [0]
Output: 1
Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in nums.
 */

import java.util.Arrays;
public class Q9_MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,6};
        System.out.println(Solution9.missingNumber(nums));
        System.out.println(Solution9.missingNumber2(nums));
    }
}

class Solution9 {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumber2(int[] nums) {
        int lengthOfNums = nums.length;
        int sumOfDigits =  (lengthOfNums*(lengthOfNums+1))/2;
        int actualSum =0;
           for (int i=0;i<nums.length;i++){
              actualSum+=nums[i];
           }
       int result = sumOfDigits - actualSum;
        return result==0 ? 0 : result;
    }
}
