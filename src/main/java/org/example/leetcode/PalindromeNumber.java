package org.example.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int temp = x;
        long sum = 0;
        int ans;
        while(temp > 0){
            ans = temp % 10;
            sum = sum * 10 + ans;
            temp /= 10;
        }
        return sum == x;
    }
}
