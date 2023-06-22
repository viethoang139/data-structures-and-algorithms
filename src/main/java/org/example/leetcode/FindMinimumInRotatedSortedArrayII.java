package org.example.leetcode;

public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int L = 0 , R = nums.length - 1;

        while(L + 1 < R){
            int mid = L + ( R- L)/2;
            if(nums[mid] > nums[R]){
                L++;
            }
            else{
                R--;
            }
        }
        return Math.min(nums[L] , nums[R]);
    }
}
