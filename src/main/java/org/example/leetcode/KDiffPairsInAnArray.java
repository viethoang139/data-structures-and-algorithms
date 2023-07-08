package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInAnArray {
    // solution 1: two pointer
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0 , j = 1;
        int count = 0;
        while(i < n && j < n){
            if(i == j){
                j++;
            }
            else{
                int diff = nums[j] - nums[i];
                if(diff > k){
                    i++;
                }
                else if(diff < k){
                    j++;
                }
                else{
                    count++;
                    i++;
                    while(i < n && nums[i] == nums[i-1]){
                        i++;
                    }
                }
            }
        }
        return count;
    }

    // solution 2: using hash map
//    public int findPairs(int[] nums, int k) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ; i < nums.length ; i++){
//            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
//        }
//        int count = 0;
//        for(int key : map.keySet()){
//            if(k == 0){
//                int value = map.get(key);
//                if(value > 1){
//                    count++;
//                }
//            }
//            else{
//                if(map.containsKey(k + key)){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
}
