package org.example.leetcode;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums == null ||nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = low + (high -low)/2;
            if(mid > 0 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            if(nums[low] <= nums[mid] && nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return nums[low];
    }
}
