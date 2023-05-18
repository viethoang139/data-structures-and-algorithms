package org.example.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        boolean check = true;
        Set<Integer> set = new HashSet<>();
        for(int key : map.keySet()){
            int value = map.get(key);
            if(set.contains(value)){
                check = false;
                break;
            }
            else{
                set.add(value);
            }
        }
        return check;
    }
}
