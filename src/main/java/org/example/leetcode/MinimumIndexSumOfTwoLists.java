package org.example.leetcode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String , Integer> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < list1.length ; i++){
            map.put(list1[i] , i);
        }
        int indexMin = Integer.MAX_VALUE;

        for(int i = 0 ; i < list2.length ; i++){
            if(map.containsKey(list2[i])){
                if(indexMin >= i + map.get(list2[i])){
                    if(indexMin > i + map.get(list2[i])){
                        list.clear();
                        indexMin = i + map.get(list2[i]);
                    }
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
