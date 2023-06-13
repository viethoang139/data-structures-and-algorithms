package org.example.leetcode;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[]freq = new int[26];
        int max = 0;
        int left = 0;
        int maxLen = 0;
        for(int right = 0 ; right < s.length() ; right++){
            freq[s.charAt(right) - 'A']++;
            max = Math.max(max, freq[s.charAt(right) - 'A']);
            while(right - left + 1 - max > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}
