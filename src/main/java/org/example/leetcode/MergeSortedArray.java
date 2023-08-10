package org.example.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        int i = nums1.length-1;
//        int j = 0;
//        while(j < nums2.length){
//            if(nums1[i] == 0){
//                nums1[i] = nums2[j];
//                i--;
//                j++;
//            }
//        }
//        Arrays.sort(nums1);
//
//    }

    // Time: O(m+n)
    // Space: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        for(int i = nums1.length -1 ; i >= 0 ; i--){
            int value1 = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE;
            int value2 = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;
            if(value1 < value2){
                nums1[i] = value2;
                p2--;
            }
            else{
                nums1[i] = value1;
                p1--;
            }
        }
    }
}
