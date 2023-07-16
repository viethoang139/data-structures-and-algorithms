package org.example.leetcode;

public class BestTimetoBuyandSellStock {
    // solution 1
//    public int maxProfit(int[] arr) {
//        int min = Integer.MAX_VALUE;
//        int ans = 0;
//        int current = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//
//            current = arr[i] - min;
//            if(ans < current){
//                ans = current;
//            }
//
//        }
//        return ans;
//    }
    // solution 2
    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 0 , j = 1;
        while(j < prices.length){
            if(prices[i] > prices[j]){
                i = j;
                j++;
            }
            else{
                int diff = prices[j] - prices[i];
                max = Math.max(diff , max);
                j++;
            }
        }
        return max;
    }

}
