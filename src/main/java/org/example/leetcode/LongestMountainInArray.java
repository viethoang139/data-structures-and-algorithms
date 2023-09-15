package org.example.leetcode;

public class LongestMountainInArray {
    // Time: O(n)
    // Space: O(1)
    public int longestMountain(int[] arr) {
        if(arr.length < 3){
            return 0;
        }
        int peek = 0;
        for(int i = 1 ; i < arr.length - 1;i++){
            if(arr[i-1] < arr[i] && arr[i + 1] < arr[i]){
                int count = 1;
                int j = i;
                while(j >= 1 && arr[j] > arr[j-1]){
                    j--;
                    count++;
                }
                while(i < arr.length - 1 && arr[i] > arr[i+1]){
                    i++;
                    count++;
                }
                peek = Math.max(peek, count);
            }

        }
        return peek;
    }
}
