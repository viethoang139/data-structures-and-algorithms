package org.example.leetcode;

import java.util.*;

public class RandomizedSet {
    private Map<Integer , Integer> map;

    public RandomizedSet() {
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val , val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        map.remove(val);
        return true;
    }

    public int getRandom() {
        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>(set);
        int size = list.size();
        int randIdx = new Random().nextInt(size);
        int key = list.get(randIdx);
        int value = map.get(key);
        return value;
    }
}
