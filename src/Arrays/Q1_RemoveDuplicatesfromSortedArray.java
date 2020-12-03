package Arrays;

/*
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 */

public class Q1_RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(Solution.removeDuplicates(nums));
	}

}

class Solution {
    public static int removeDuplicates(int[] nums) {
    	int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]) {
                j++;
            }
            else {
                nums[++i]=nums[j++];
            }
        }
        return i+1;
    }
}