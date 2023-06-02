package org.example.leetcode;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int buyingDate = 0;
        int sellingDate = 0;
        int total_profit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] >= prices[i-1]){
                sellingDate++;
            }
            else{
                total_profit += prices[sellingDate] - prices[buyingDate];
                sellingDate = buyingDate = i;
            }
        }
        total_profit += prices[sellingDate] - prices[buyingDate];
        return total_profit;
    }
}
