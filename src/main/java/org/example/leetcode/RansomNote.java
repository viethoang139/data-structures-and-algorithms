package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    // Time: O(m+n)
    // Space: O(1)
//    public boolean canConstruct(String str1, String str2) {
//        if(str1.length() > str2.length()){
//            return false;
//        }
//        int[]store = new int[26];
//        for(int i = 0 ; i < str2.length() ; i++){
//            store[str2.charAt(i) - 'a']++;
//        }
//        for(int i = 0 ; i < str1.length() ;i++){
//            if(store[str1.charAt(i) - 'a'] == 0){
//                return false;
//            }
//            store[str1.charAt(i) - 'a']--;
//        }
//        return true;
//    }

    // Time: O(m+n)
    // Space:O(m+n)

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char item : ransomNote.toCharArray()){
            map1.put(item , map1.getOrDefault(item,0)+1);
        }

        for(char item : magazine.toCharArray()){
            map2.put(item , map2.getOrDefault(item,0)+1);
        }

        boolean check = false;
        for(char key : map1.keySet()){
            if(map2.containsKey(key) && map2.get(key) >= map1.get(key)){
                check = true;
            }
            else{
                check = false;
                break;
            }
        }
        return check;


    }
}
