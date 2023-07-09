package org.example.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    // solution 1
//    public int strStr(String str1, String str2) {
//        for(int i = 0 ; ; i++){
//            for(int j = 0 ; ; j++){
//                if(j == str2.length()){
//                    return i;
//                }
//                if(i+j == str1.length()){
//                    return -1;
//                }
//                if(str2.charAt(j) != str1.charAt(i+j)){
//                    break;
//                }
//            }
//        }
//
//    }
    // solution 2
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int index = 0;
        while(index < n){
            int i = index;
            int j = 0;
            while(i < n && j < m && haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            if(j == m){
                return index;
            }
            index++;
        }
        return -1;
    }
}
