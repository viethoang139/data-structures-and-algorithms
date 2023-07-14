package org.example.leetcode;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1;
        int left = 0;
        int count = 0;
        for(int right = 0 ; right < nums.length ; right++){
            product*=nums[right];
            while(left <= right && product >= k){
                product /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}
