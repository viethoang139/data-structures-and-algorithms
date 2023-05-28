package org.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = (int)Math.pow(nums[i],2);
            list.add(nums[i]);
        }

        Collections.sort(list);

        return list.stream().mapToInt(i -> i).toArray();

    }
}
