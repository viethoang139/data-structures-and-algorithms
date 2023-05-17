package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean check = false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int ans = Math.abs(i - map.get(nums[i]));
                if(ans <= k){
                    check = true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
            else{
                map.put(nums[i] ,i);
            }
        }
        return check;
    }
}
