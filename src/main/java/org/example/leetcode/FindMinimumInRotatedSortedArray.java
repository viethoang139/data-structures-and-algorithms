package org.example.leetcode;

public class FindMinimumInRotatedSortedArray {
    // solution 1
//    public int findMin(int[] nums) {
//        if(nums == null ||nums.length == 0){
//            return 0;
//        }
//        if(nums.length == 1){
//            return nums[0];
//        }
//        int low = 0;
//        int high = nums.length - 1;
//        while(low < high){
//            int mid = low + (high -low)/2;
//            if(mid > 0 && nums[mid] < nums[mid-1]){
//                return nums[mid];
//            }
//            if(nums[low] <= nums[mid] && nums[mid] > nums[high]){
//                low = mid + 1;
//            }
//            else{
//                high = mid -1;
//            }
//        }
//        return nums[low];
//    }
    // solution 2

    public int findMin(int[] nums) {
        int L = 0 , R = nums.length - 1;
        if(nums[L] < nums[R]){
            return nums[L];
        }
        while(L + 1 < R){
            int mid = L + (R- L)/2;
            if(nums[mid] > nums[R]){
                L = mid;
            }
            else{
                R = mid;
            }
        }
        return Math.min(nums[L] , nums[R]);
    }
}
