package org.example.leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(s.charAt(i));
            }
        }
        String str = sb.toString();
        String ans = str.toLowerCase();
        int start = 0;
        int end = ans.length() -1;
        while(start <= end){
            if(ans.charAt(start) == ans.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
