package org.example.leetcode;

public class MoveZezo {

    // solution 1
//    public void moveZeroes(int[] arr) {
//        int count = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] != 0){
//                arr[count++] = arr[i];
//            }
//        }
//        while(count < arr.length){
//            arr[count++] = 0;
//        }
//    }

    // solution 2
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int l = 0, r = 1;
        while (r < nums.length) {
            if (nums[l] != 0) {
                l++;
                r++;
            } else if (nums[r] == 0) {
                r++;
            } else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;

            }
        }

    }
}
