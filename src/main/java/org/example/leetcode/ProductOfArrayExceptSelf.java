package org.example.leetcode;

public class ProductOfArrayExceptSelf {

    // Time: O(n)
    // Space: O(1)
    public int[] productExceptSelf(int[] nums) {
        int[]prefix = new int[nums.length];
        prefix[0] = 1;
        for(int i = 1 ; i < nums.length ; i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        int suffix = 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            prefix[i] = suffix * prefix[i];
            suffix = suffix * nums[i];
        }
        return prefix;
    }
}

