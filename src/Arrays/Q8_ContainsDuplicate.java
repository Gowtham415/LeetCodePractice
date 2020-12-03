package Arrays;

/*
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q8_ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] ={1,2,3,4,2,4,57,4};
        System.out.println(Solution8.containsDuplicate(nums));
        System.out.println(Solution8.containsDuplicate2(nums));
    }
}

class Solution8 {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> digits = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(digits.containsKey(nums[i])){
                return true;
            }else{
                digits.put(nums[i],1);
            }
        }
        return false;
    }

// Alternative Solution
    public static boolean containsDuplicate2(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return (list.stream().distinct().count() < list.size());
    }
}


