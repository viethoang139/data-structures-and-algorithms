package org.example.leetcode;

public class FactorialTrailingZeroes {

    // Time: O(log(n))
    // Space: O(1)
    public int trailingZeroes(int n) {
        int count = 0;
        for(int i = 5 ; i <= n ; i*=5){
            count += n/i;
        }
        return count;
    }
}
