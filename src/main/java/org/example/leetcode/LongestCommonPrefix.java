package org.example.leetcode;

public class LongestCommonPrefix {
    // solution 1
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length == 0){
//            return "";
//        }
//        int length = strs[0].length();
//        for(int i = 1 ; i < strs.length ;i++){
//            length = Math.min(length , strs[i].length());
//            for(int j = 0 ; j < length ; j++){
//                char c = strs[0].charAt(j);
//                char d = strs[i].charAt(j);
//                if(c != d){
//                    length = j;
//                    break;
//                }
//            }
//        }
//        return strs[0].substring(0, length);
//    }

    // solution 2
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1 ; i < strs.length ; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

}
