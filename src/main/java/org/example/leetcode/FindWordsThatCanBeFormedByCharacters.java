package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map1 = new HashMap<>();

        for(char item: chars.toCharArray()){
            map1.put(item, map1.getOrDefault(item,0)+1);
        }

        int ans = 0;

        for(String word : words){
            Map<Character,Integer> wordCount = new HashMap<>();
            for(char item : word.toCharArray()){
                wordCount.put(item,wordCount.getOrDefault(item,0)+1);
            }

            boolean check = true;
            for(Character item : wordCount.keySet()){
                if(map1.getOrDefault(item,0) < wordCount.get(item)){
                    check = false;
                    break;
                }
            }
            if(check){
                ans += word.length();
            }

        }
        return ans;
    }
}
