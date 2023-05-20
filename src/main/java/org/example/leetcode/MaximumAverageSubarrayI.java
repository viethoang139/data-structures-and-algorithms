package org.example.leetcode;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int max_sum = 0;
        for(int i = 0; i < k ; i++){
            max_sum += nums[i];
        }
        int max = max_sum;
        for(int i = k ; i < nums.length ; i++){
            max = max + nums[i] - nums[i-k];
            max_sum = Math.max(max,max_sum);
        }
        return (double)max_sum/k;
    }
}
