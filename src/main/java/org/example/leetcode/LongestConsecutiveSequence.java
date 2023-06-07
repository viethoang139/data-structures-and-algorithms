package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int ans = 1;
        Set<Integer> set = new HashSet<>();
        for(int item : nums){
            set.add(item);
        }
        for(int item : nums){
            if(!set.contains(item - 1)){
                int count = 1;
                while(set.contains(item+1)){
                    item++;
                    count++;
                }
                ans = Math.max(ans , count);
            }
        }
        return ans;
    }
}
