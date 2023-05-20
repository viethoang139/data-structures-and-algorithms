package org.example.leetcode;

public class MergeStringsAlternately {

    // solution 1
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i = 0;
        int j = 0;
        while(i < word1.length() && j < word2.length()){
            ans += word1.charAt(i);
            ans += word2.charAt(j);
            i++;
            j++;
        }

        while(i < word1.length()){
            ans += word1.charAt(i);
            i++;
        }

        while(j < word2.length()){
            ans += word2.charAt(j);
            j++;
        }

        return ans;

    }

    // solution 2
//    public String mergeAlternately(String word1, String word2) {
//        StringBuilder res = new StringBuilder();
//        int i = 0;
//        int j = 0;
//        while(i < word1.length() || j < word2.length()){
//            if(i < word1.length()){
//                res.append(word1.charAt(i++));
//            }
//            if(j < word2.length()){
//                res.append(word2.charAt(j++));
//            }
//        }
//        return res.toString();

    }


