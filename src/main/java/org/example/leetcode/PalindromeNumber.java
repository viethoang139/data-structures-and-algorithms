package org.example.leetcode;

public class PalindromeNumber {
    // solution 1:
    // Time: O(n)
    // Space: O(1)
//    public boolean isPalindrome(int x) {
//        int temp = x;
//        long sum = 0;
//        int ans;
//        while(temp > 0){
//            ans = temp % 10;
//            sum = sum * 10 + ans;
//            temp /= 10;
//        }
//        return sum == x;
//    }

    // solution 2:
    // Time: O(log(n))
    // Space: O(1)
    public boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
        if(x < 0 || x%10 == 0){
            return false;
        }
        int r = 0;
        while(x != 0){
            r = r*10 + (x%10);
            if(x == r || x == r /10){
                return true;
            }
            x/=10;
        }
        return false;
    }
}
