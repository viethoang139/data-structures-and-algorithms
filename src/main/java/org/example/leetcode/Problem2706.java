package org.example.leetcode;

import java.util.Arrays;

public class Problem2706 {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(money - (prices[0] + prices[1]) >= 0){
            return money - (prices[0] + prices[1]);
        }
        return money;
    }
}
