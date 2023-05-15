package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleElementinaSortedArray {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+ 1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        int ans = 0;
        for(int key : map.keySet()){
            int value = map.get(key);
            if(value == 1){
                ans = key;
                break;
            }
        }
        return ans;
    }
}
