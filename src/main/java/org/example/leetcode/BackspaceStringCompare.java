package org.example.leetcode;

public class BackspaceStringCompare {

    public int backspaceCompare(String s, String t) {
        return getString(s).compareTo(getString(t));
    }

    private String getString(String str){
        int n = str.length();
        int count = 0;
        String result = "";
        for(int i = n - 1 ; i >= 0 ; i--){
            char ch = str.charAt(i);
            if(ch == '#'){
                count++;
            }
            else{
                if(count > 0){
                    count--;
                }
                else{
                    result += ch;
                }
            }
        }
        return result;
    }

}
