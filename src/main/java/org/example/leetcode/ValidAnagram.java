package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // solution 1: using hashmap
    // Time: O(n)
    // Space: O(n)
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()){
//            return false;
//        }
//        Map<Character,Integer> map1 = new HashMap<>();
//        Map<Character,Integer> map2 = new HashMap<>();
//        for(int i = 0 ; i < s.length() ; i++){
//            char ch = s.charAt(i);
//            map1.put(ch , map1.getOrDefault(ch,0)+1);
//        }
//
//        for(int i = 0 ; i < t.length() ; i++){
//            char ch = t.charAt(i);
//            map2.put(ch , map2.getOrDefault(ch,0)+1);
//        }
//        for(Character ch : map1.keySet()){
//            if(!map1.get(ch).equals(map2.get(ch))){
//                return false;
//            }
//        }
//        return true;
//
//    }

    // solution 2: using array to store 26 alphabet character
    // Time: O(n)
    // Space: O(1)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[]store = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            store[s.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < t.length() ; i++){
            store[t.charAt(i) - 'a']--;
            if(store[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }

        return true;

    }

}
