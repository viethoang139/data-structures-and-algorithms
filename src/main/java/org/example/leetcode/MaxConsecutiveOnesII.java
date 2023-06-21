package org.example.leetcode;

public class MaxConsecutiveOnesII {
     public int findMaxConsecutiveOnes(int[]nums){
        if(nums.length < 2){
            return nums.length;
        }
        int left = 0;
        int count = 0;
        int maxLen = 0;
        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right] == 0){
                count++;
            }
            while(count > 1){
                if(nums[left] == 0){
                    count--;
                }
                left++;
            }
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}
