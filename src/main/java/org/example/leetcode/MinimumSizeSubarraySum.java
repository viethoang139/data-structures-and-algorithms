package org.example.leetcode;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;
        int count = 0;
        for(int windowEnd = 0 ; windowEnd < nums.length ; windowEnd++){
            windowSum += nums[windowEnd];
            while(windowSum >= target){
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        if(minLength != Integer.MAX_VALUE){
            return minLength;
        }
        return 0;
    }
}
