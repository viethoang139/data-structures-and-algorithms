package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    // solution 1
//    public int characterReplacement(String s, int k) {
//        int[]freq = new int[26];
//        int max = 0;
//        int left = 0;
//        int maxLen = 0;
//        for(int right = 0 ; right < s.length() ; right++){
//            freq[s.charAt(right) - 'A']++;
//            max = Math.max(max, freq[s.charAt(right) - 'A']);
//            while(right - left + 1 - max > k){
//                freq[s.charAt(left) - 'A']--;
//                left++;
//            }
//            maxLen = Math.max(maxLen , right - left + 1);
//        }
//        return maxLen;
//    }
    // solution 2
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        int mostFreq = 0;
        Map<Character ,Integer> map = new HashMap<>();
        for(int right = 0 ; right < s.length() ; right++){
            map.put(s.charAt(right) , map.getOrDefault(s.charAt(right),0)+1);
            mostFreq = Math.max(mostFreq , map.get(s.charAt(right)));
            while((right - left + 1) - mostFreq > k){
                char ch = s.charAt(left);
                map.put(ch , map.get(ch) - 1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                left++;
            }
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}
