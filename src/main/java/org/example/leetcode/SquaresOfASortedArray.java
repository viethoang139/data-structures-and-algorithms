package org.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquaresOfASortedArray {
    // solution 1
    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = (int)Math.pow(nums[i],2);
            list.add(nums[i]);
        }

        Collections.sort(list);

        return list.stream().mapToInt(i -> i).toArray();
    }

    // solution 2
//    public int[] sortedSquares(int[] nums) {
//        int[]result = new int[nums.length];
//        int i = 0;
//        int index = nums.length - 1;
//        int j = nums.length - 1;
//        while(i <= j){
//            int start = nums[i]*nums[i];
//            int end = nums[j]*nums[j];
//            if(start < end){
//                result[index] = end;
//                j--;
//            }
//            else{
//                result[index] = start;
//                i++;
//            }
//            index--;
//        }
//        return result;
//    }

}
