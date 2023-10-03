package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        Set<Character> set = new HashSet<>();
        for(char item : vowels.toCharArray()){
            set.add(item);
        }
        int l = 0, r = s.length() - 1;
        char[]arr = s.toCharArray();
        while(l < r){
            while(l < r && !set.contains(arr[l])){
                l++;
            }
            while(l < r && !set.contains(arr[r])){
                r--;
            }
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return String.valueOf(arr);
    }
}
