package org.example.leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
            if(count == s.length()){
                return true;
            }
        }
        return false;
    }
}
