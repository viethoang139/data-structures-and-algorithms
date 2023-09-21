package org.example.leetcode;

public class ValidPalindromeII {
    // Time: O(n)
    // Space: O(1)
    public boolean validPalindrome(String str) {
        int s = 0;
        int e = str.length() - 1;
        while(s <= e){
            if(str.charAt(s) == str.charAt(e)){
                s++;
                e--;
            }
            else{
                boolean case1 = check(str,s+1,e);
                boolean case2 = check(str,s,e-1);
                if(case1 == true || case2 == true){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    private boolean check(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
