package org.example.leetcode;

import java.util.*;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new LinkedHashSet<>();
        for(int item : nums){
            set.add(item);
        }
        List<Integer> list = new ArrayList<>(set);
        int count = 1;
        for(int i = list.size() - 1 ; i >= 0 ; i--){
            if(count == 3){
                return list.get(i);
            }
            count++;
        }
        return list.get(list.size() - 1);

    }
}
