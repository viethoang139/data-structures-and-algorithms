package org.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllNumbersDisappearedInAnArray {

    // Time: O(n)
    // Space: O(n)
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        Map<Integer,Boolean> map = new HashMap<>();
//        for(int i = 0 ;i < nums.length ; i++){
//            map.put(nums[i] , true);
//        }
//
//        for(int i = 1 ; i <= nums.length ; i++){
//            if(map.get(i) == null){
//                list.add(i);
//            }
//        }
//        return list;
//    }

    // Time: O(n)
    // Space: O(n)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[]arr = new int[nums.length + 1];
        for(int i = 0 ; i < nums.length ; i++){
            arr[nums[i]]++;
        }
        for(int i = 1 ; i <= nums.length ; i++){
            if(arr[i] == 0){
                list.add(i);
            }
        }
        return list;
    }
}
