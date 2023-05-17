package org.example.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();

        Set<Integer> set2 = new HashSet<>();
        for(int item : nums1){
            set1.add(item);
        }
        for(int item : nums2){
            set2.add(item);
        }
        set1.retainAll(set2);
        List<Integer> list = new ArrayList<>(set1);
        int[]result = new int[list.size()];
        for(int i = 0 ; i < list.size() ;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
