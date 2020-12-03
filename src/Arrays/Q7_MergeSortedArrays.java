package Arrays;
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

 */
public class Q7_MergeSortedArrays {
    public static void main(String[] args) {
        int nums1[] = {1,4,6,0,0,0};
        int nums2[] = {2,3,5};
        Solution7.merge(nums1,3,nums2,3);
    }
}

class Solution7 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter =0;
        for(int i=m;i<nums1.length;i++){
            nums1[i] = nums2[counter];
            counter++;
        }

        for(int i=0;i< nums1.length-1;i++){
            for(int j=i+1;j< nums1.length;j++){
                if(nums1[i]>nums1[j]){
                    int temp = nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
    }
}
