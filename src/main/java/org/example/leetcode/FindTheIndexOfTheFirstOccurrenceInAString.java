package org.example.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String str1, String str2) {
        for(int i = 0 ; ; i++){
            for(int j = 0 ; ; j++){
                if(j == str2.length()){
                    return i;
                }
                if(i+j == str1.length()){
                    return -1;
                }
                if(str2.charAt(j) != str1.charAt(i+j)){
                    break;
                }
            }
        }

    }
}
