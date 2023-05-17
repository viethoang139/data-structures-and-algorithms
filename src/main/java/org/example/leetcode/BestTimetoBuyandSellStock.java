package org.example.leetcode;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        int current = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }

            current = arr[i] - min;
            if(ans < current){
                ans = current;
            }

        }
        return ans;

    }
}
