package org.example.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = nums1.length-1;
        int j = 0;
        while(j < nums2.length){
            if(nums1[i] == 0){
                nums1[i] = nums2[j];
                i--;
                j++;
            }
        }
        Arrays.sort(nums1);

    }
}
