package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1 ; j < n ;j++){
                if(j > (i+1) && nums[j] == nums[j-1]){
                    continue;
                }
                int l = j + 1 , r = n - 1;
                while(l < r){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[l] + (long)nums[r];
                    if(sum < target){
                        l++;
                        while(l < r && nums[l] == nums[l-1]){
                            l++;
                        }
                    }
                    else if(sum > target){
                        r--;
                        while(r > l && nums[r] == nums[r+1]){
                            r--;
                        }
                    }
                    else{
                        list.add(List.of(nums[i] , nums[j] , nums[l] , nums[r]));
                        l++;
                        while(l < r && nums[l] == nums[l-1]){
                            l++;
                        }
                    }
                }
            }
        }
        return list;
    }
}
