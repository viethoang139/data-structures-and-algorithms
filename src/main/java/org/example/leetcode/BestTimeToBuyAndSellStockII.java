package org.example.leetcode;

public class BestTimeToBuyAndSellStockII {
//    public int maxProfit(int[] prices) {
//        int buyingDate = 0;
//        int sellingDate = 0;
//        int total_profit = 0;
//        for(int i = 1 ; i < prices.length ; i++){
//            if(prices[i] >= prices[i-1]){
//                sellingDate++;
//            }
//            else{
//                total_profit += prices[sellingDate] - prices[buyingDate];
//                sellingDate = buyingDate = i;
//            }
//        }
//        total_profit += prices[sellingDate] - prices[buyingDate];
//        return total_profit;
//    }

    // Time: O(n)
    // Space: O(1)
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int sum = 0;
        while(right < prices.length){
            if(prices[right] > prices[left]){
                sum += prices[right] - prices[left];
            }
            left++;
            right++;
        }
        return sum;
    }

}
