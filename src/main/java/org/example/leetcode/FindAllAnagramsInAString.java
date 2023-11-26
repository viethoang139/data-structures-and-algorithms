package org.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int windowStart = 0;
        int matched = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(char item : p.toCharArray()){
            map.put(item, map.getOrDefault(item,0)+1);
        }
        for(int windowEnd = 0 ; windowEnd < s.length(); windowEnd++){
            char rightChar = s.charAt(windowEnd);
            if(map.containsKey(rightChar)){
                map.put(rightChar, map.get(rightChar) - 1);
                if(map.get(rightChar) == 0){
                    matched++;
                }
            }
            if(matched == map.size()){
                list.add(windowStart);
            }
            if(windowEnd >= p.length() - 1){
                char leftChar = s.charAt(windowStart);
                if(map.containsKey(leftChar)){
                    if(map.get(leftChar) == 0){
                        matched--;
                    }
                    map.put(leftChar, map.getOrDefault(leftChar,0)+1);
                }
                windowStart++;
            }
        }
        return list;
    }
}
