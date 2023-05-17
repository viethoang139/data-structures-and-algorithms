package org.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+ 1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }

        for(int key : map.keySet()){
            int value = map.get(key);
            if(value > n/3){
                list.add(key);
            }
        }

        return list;
    }
}
