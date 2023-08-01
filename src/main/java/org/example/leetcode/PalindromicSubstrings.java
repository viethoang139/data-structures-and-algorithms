package org.example.leetcode;

public class PalindromicSubstrings {
    // Time: O(n^2)
    // Space: O(1)
    int count = 0;
    public int countSubstrings(String s) {
        for(int i = 0 ; i < s.length() ; i++){
            expandAroundCenter(s,i,i);
            expandAroundCenter(s,i,i+1);
        }
        return count;
    }

    private void expandAroundCenter(String s, int left , int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
    }
}
