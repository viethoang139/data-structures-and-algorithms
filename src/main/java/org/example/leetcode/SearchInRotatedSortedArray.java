package org.example.leetcode;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = binarySearch(nums , low , high , target);
        return ans;
    }
    public int binarySearch(int[]nums , int low , int high , int target){
        if(high < low){
            return -1;
        }
        int mid = (low + high)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[low] <= nums[mid]){
            if(target >= nums[low] && target <= nums[mid]){
                return binarySearch(nums , low , mid -1 , target);
            }
            return binarySearch(nums ,  mid+1, high , target);
        }
        else{
            if(target >= nums[mid] && target <= nums[high]){
                return binarySearch(nums , mid+1 , high , target);
            }
            return binarySearch(nums , low , mid -1 , target);
        }
    }
}
