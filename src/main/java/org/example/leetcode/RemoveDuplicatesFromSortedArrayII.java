package org.example.leetcode;

public class RemoveDuplicatesFromSortedArrayII {
    // solution 1
//    public int removeDuplicates(int[] nums) {
//        int i = 0;
//        for(int n : nums){
//            if(i < 2 || n > nums[i-2]){
//                nums[i++] = n;
//            }
//        }
//        return i;
//    }

    // solution 2
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n < 3){
            return n;
        }
        int l = 0 , r = 1 , count = 0;
        while(r < n){
            if(nums[l] != nums[r]){
                l++;
                nums[l] = nums[r];
                count = 0;
            }
            else if(nums[l] == nums[r] && count < 1){
                count++;
                l++;
                nums[l] = nums[r];
            }
            r++;

        }
        return l + 1;
    }
}
