package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    // solution 1: using hashmap
//    public int singleNumber(int[] arr) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ; i < arr.length ; i++){
//            if(map.containsKey(arr[i])){
//                map.remove(arr[i]);
//            }
//            else{
//                map.put(arr[i],arr[i]);
//            }
//        }
//        int ans = 0;
//        for(Integer value : map.values()){
//            ans = value;
//        }
//        return ans;
//    }

    // solution 2: using XOR
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
