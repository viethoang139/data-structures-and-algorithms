package org.example.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    // solution 1
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    // solution 2

//    public int firstUniqChar(String s) {
//        int freq[] = new int[26];
//        for(int i = 0 ; i < s.length() ; i++){
//            freq[s.charAt(i) - 'a']++;
//        }
//        for(int i = 0 ; i < s.length() ; i++){
//            if(freq[s.charAt(i)-'a'] == 1){
//                return i;
//            }
//        }
//        return -1;
//    }


}
