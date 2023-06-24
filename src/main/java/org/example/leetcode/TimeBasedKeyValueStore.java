package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeBasedKeyValueStore {
    Map<String , TreeMap<Integer , String>> map = new HashMap<>();



    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key , new TreeMap<>());
        }
        TreeMap<Integer , String> treeMap = map.get(key);
        treeMap.put(timestamp , value);
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        TreeMap<Integer , String> treeMap = map.get(key);
        Integer smallTimeStamp = treeMap.floorKey(timestamp);
        if(smallTimeStamp == null){
            return "";
        }
        return treeMap.get(smallTimeStamp);
    }
}
