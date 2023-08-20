package org.example.leetcode;

import java.util.*;

public class FindAllDuplicatesInAnArray {

    // Time: O(n)
    // Space: O(n)
//    public List<Integer> findDuplicates(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ; i < nums.length ;i++){
//            map.put(nums[i] , map.getOrDefault(nums[i],0) + 1);
//        }
//        for(int key : map.keySet()){
//            int value = map.get(key);
//            if(value == 2){
//                list.add(key);
//            }
//        }
//        return list;
//    }

    // Time: O(n)
    //Space: O(1)
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                list.add(Math.abs(nums[i]));
            }
            if(nums[index] > 0){
                nums[index] = -1 * nums[index];
            }
        }
        return list;
    }
}
