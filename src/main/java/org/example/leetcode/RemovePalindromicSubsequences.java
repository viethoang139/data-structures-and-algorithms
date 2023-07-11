package org.example.leetcode;

public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j && s.charAt(i) == s.charAt(j)){
            i++;
            j--;
        }
        if(i >= j){
            return 1;
        }
        return 2;
    }
}
