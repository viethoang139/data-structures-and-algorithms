package org.example.leetcode;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[]ans = new int[nums.length*2];
        int i = 0;
        int j = 0;
        while(i < ans.length && j < nums.length){
            ans[i] = nums[j];
            i++;
            j++;
        }
        j = 0;
        while(i < ans.length){
            ans[i] = nums[j];
            i++;
            j++;
        }
        return ans;
    }
}
