package org.example.leetcode;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length == 2 && nums[0] < nums[1]){
            return 1;
        }
        int L = 0;
        int R = nums.length - 1;

        while(L + 1 < R){
            int mid = L + (R- L)/2;
            if(nums[mid] > nums[mid - 1]){
                L = mid;
            }
            else{

                R = mid;
            }
        }
        if(nums[L] > nums[R]){
            return L;
        }
        return R;
    }
}
