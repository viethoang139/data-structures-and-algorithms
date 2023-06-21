package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {

    public int lengthOfLongestSubstringWithAtMostKDistinctCharacters(String s , int k){
        if(s.length() == 0){
            return 0;
        }
        int left = 0;
        int maxLength = 0;
        Map<Character , Integer> map = new HashMap<>();
        for(int right = 0 ; right < s.length() ; right++){
            map.put(s.charAt(right) , map.getOrDefault(s.charAt(right),0) + 1);

            while (map.size() > k){
                char ch = s.charAt(left);
                map.put(ch , map.get(ch) - 1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                left++;
            }
            maxLength = Math.max(maxLength , right - left + 1);

        }
        return maxLength;
    }
}
