package org.example.leetcode;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String ans = "";
        String res = "";
        String str = s.trim();
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ' '){
                if(count < 1){
                    ans = res + ans;
                    ans = str.charAt(i) + ans;
                    res = "";
                    count++;
                }
            }
            else{
                count = 0;
                res += str.charAt(i);
            }
        }
        ans = res + ans;
        return ans;
    }
}
