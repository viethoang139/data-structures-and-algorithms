package org.example.leetcode;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int zezoCount = 0;
        int windowStart =0;
        for(int windowEnd = 0 ; windowEnd < nums.length ; windowEnd++){
            if(nums[windowEnd] == 0){
                zezoCount++;
            }
            while(zezoCount > k){
                if(nums[windowStart] == 0){
                    zezoCount--;
                }
                windowStart++;
            }
            max = Math.max(max , windowEnd - windowStart + 1);
        }
        return max;
    }
}
