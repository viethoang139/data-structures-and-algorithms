package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            searchPair(nums , -nums[i] , i + 1 , list);
        }
        return list;
    }

    public List<List<Integer>> searchPair(int[]nums , int target , int start , List<List<Integer>>ans){
        int end = nums.length - 1;
        while(start < end){
            int currentSum = nums[start] + nums[end];
            if(currentSum == target){
                ans.add(Arrays.asList(-target, nums[start] , nums[end]));
                start++;
                end--;
                while(start < end && nums[start] == nums[start - 1]){
                    start++;
                }
                while(start < end && nums[end] == nums[end + 1]){
                    end--;
                }
            }
            else if(currentSum < target){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}
