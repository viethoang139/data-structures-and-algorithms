package org.example.leetcode;

public class SearchInRotatedSortedArray {

    // solution 1
//    public int search(int[] nums, int target) {
//        int low = 0;
//        int high = nums.length - 1;
//        int ans = binarySearch(nums , low , high , target);
//        return ans;
//    }
//    public int binarySearch(int[]nums , int low , int high , int target){
//        if(high < low){
//            return -1;
//        }
//        int mid = (low + high)/2;
//        if(nums[mid] == target){
//            return mid;
//        }
//        if(nums[low] <= nums[mid]){
//            if(target >= nums[low] && target <= nums[mid]){
//                return binarySearch(nums , low , mid -1 , target);
//            }
//            return binarySearch(nums ,  mid+1, high , target);
//        }
//        else{
//            if(target >= nums[mid] && target <= nums[high]){
//                return binarySearch(nums , mid+1 , high , target);
//            }
//            return binarySearch(nums , low , mid -1 , target);
//        }
//    }

    // solution 2
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[low] <= nums[mid]){
                if(nums[mid] < target || nums[low] > target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            else{
                if(nums[mid] > target || nums[high] < target){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

        }
        return -1;
    }

}
