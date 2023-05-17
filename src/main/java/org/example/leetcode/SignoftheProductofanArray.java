package org.example.leetcode;

public class SignoftheProductofanArray {
    public int arraySign(int[] nums) {
        int countPositive = 0;
        int countNegative = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                return 0;
            }
            else if(nums[i] > 0){
                countPositive++;
            }
            else{
                countNegative++;
            }
        }
        if( countNegative % 2 == 0){
            return 1;
        }
        else{
            return -1;
        }
    }
}
