package org.example.leetcode;

public class RemoveDuplicatesFromSortedArray {
    // solution 1
//    public int removeDuplicates(int[] nums) {
//        int i = 0;
//        for(int n : nums){
//            if(i == 0 || n > nums[i-1]){
//                nums[i++] = n;
//            }
//        }
//        return i;
//    }

    // solution 2
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return n;
        }
        int l = 0 , r = 1;
        while(r < n){
            if(nums[l] == nums[r]){
                r++;
            }
            else{
                nums[l+1] = nums[r];
                l++;
            }
        }
        return l + 1;
    }

}

