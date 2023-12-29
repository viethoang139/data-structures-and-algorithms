package org.example.leetcode;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] -1 )* (nums[nums.length - 2] -1);
    }
}
