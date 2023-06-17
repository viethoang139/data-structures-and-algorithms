package org.example.leetcode;

public class RansomNote {
    public boolean canConstruct(String str1, String str2) {
        if(str1.length() > str2.length()){
            return false;
        }
        int[]store = new int[26];
        for(int i = 0 ; i < str2.length() ; i++){
            store[str2.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < str1.length() ;i++){
            if(store[str1.charAt(i) - 'a'] == 0){
                return false;
            }
            store[str1.charAt(i) - 'a']--;
        }
        return true;
    }
}
