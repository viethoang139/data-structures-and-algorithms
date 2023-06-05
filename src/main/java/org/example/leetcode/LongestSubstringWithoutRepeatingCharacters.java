package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int windowStart = 0;
        int maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int windowEnd = 0 ; windowEnd < s.length() ; windowEnd++){
            char right = s.charAt(windowEnd);
            if(map.containsKey(right)){
                windowStart = Math.max(windowStart,map.get(right) + 1);
            }
            map.put(right,windowEnd);
            maxLen = Math.max(maxLen , windowEnd - windowStart+1);
        }
        return maxLen;
    }
}
