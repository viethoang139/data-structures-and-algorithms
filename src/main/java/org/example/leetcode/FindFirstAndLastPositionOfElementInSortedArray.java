package org.example.leetcode;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int[] result = new int[2];
        int findFirst = findFirstPosition(nums , target);
        int findLast = findLastPosition(nums , target);
        result[0] = findFirst;
        result[1] = findLast;
        return result;
    }

    private int findFirstPosition(int[]nums , int target){
        int L = 0;
        int R = nums.length - 1;
        while(L + 1 <  R){
            int mid = L + (R - L)/2;
            if(target > nums[mid]){
                L = mid;
            }
            else{
                R = mid;
            }
        }
        if(nums[L] == target) return L;
        if(nums[R] == target) return R;
        return -1;
    }
    private int findLastPosition(int[]nums , int target){
        int L = 0;
        int R = nums.length - 1;
        while(L + 1 <  R){
            int mid = L + (R - L)/2;
            if(target >= nums[mid]){
                L = mid;
            }
            else{
                R = mid;
            }
        }
        if(nums[R] == target) return R;
        if(nums[L] == target) return L;
        return -1;
    }
}
