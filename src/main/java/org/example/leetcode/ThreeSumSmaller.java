package org.example.leetcode;

import java.util.Arrays;

public class ThreeSumSmaller {
     public int threeSumSmaller(int[]nums , int target){
        if(nums.length == 0){
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ;i++){
            int L = i + 1;
            int R = nums.length - 1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum < target){
                    count += (R-L);
                    L++;
                }
                else{
                    R--;
                }
            }
        }
        return count;
    }
}
