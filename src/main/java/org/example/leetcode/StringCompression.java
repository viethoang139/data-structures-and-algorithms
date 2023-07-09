package org.example.leetcode;

public class StringCompression {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0 , j = 0 , index = 0;
        int count = 0;
        while(j < n){
            char letter = chars[j];
            while(j < n && chars[i] == chars[j]){
                j++;
                count++;
            }
            chars[index++] = letter;
            String digit = Integer.toString(count);
            if(count > 1){
                for(char item : digit.toCharArray()){
                    chars[index++] = item;
                }
            }
            i = j;
            count = 0;
        }
        return index;
    }
}
