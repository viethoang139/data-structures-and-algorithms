package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i <= nums.length ; i++){
            map.put(i,i);
        }
        for(int i = 0 ; i < nums.length;i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }
        }
        int ans = 0;
        for(int item : map.values()){
            ans = item;
        }
        return ans;
    }
}
