package org.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 1 ; i <= nums.length ;i++){
            map.put(i,i);
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }
        }
        for(int key : map.keySet()){
            list.add(key);
        }
        return list;
    }
}
