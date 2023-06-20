package org.example.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ; i++){
            int L = i + 1;
            int R = nums.length - 1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == target){
                    return target;
                }
                else if(sum < target){
                    L++;
                }
                else{
                    R--;
                }
                int curr = Math.abs(sum - target);
                if(curr < min){
                    min = curr;
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
