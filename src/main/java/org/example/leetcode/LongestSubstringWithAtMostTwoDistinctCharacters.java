package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostTwoDistinctCharacters {
     public int lengthOfLongestSubstringWithAtMostTwoDistinct(String s){
         if(s.length() < 3){
             return s.length();
         }
        int L = 0;
        int length = 0;
        Map<Character , Integer> map = new HashMap<>();
        for(int R = 0 ; R < s.length() ; R++){
            map.put(s.charAt(R) , map.getOrDefault(s.charAt(R) , 0) + 1);

            while(map.size() > 2){
                char ch = s.charAt(L);
                map.put(ch , map.get(ch) - 1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                L++;
            }

            length = Math.max(length , R - L + 1);

        }
        return length;
    }
}
