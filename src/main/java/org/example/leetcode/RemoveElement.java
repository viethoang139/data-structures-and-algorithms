package org.example.leetcode;

public class RemoveElement {
    // solution 1
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }

    // solution 2
//    public int removeElement(int[] nums, int val) {
//        int i = 0 , j = 0;
//        while(i < nums.length){
//            if(nums[i] != val){
//                nums[j] = nums[i];
//                j++;
//            }
//            i++;
//        }
//        return j;
//    }
}
