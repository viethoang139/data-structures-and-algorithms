package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] arr) {
        int windowStart = 0;
        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int windowEnd = 0 ; windowEnd < arr.length ; windowEnd++){
            map.put(arr[windowEnd] , map.getOrDefault(arr[windowEnd],0) + 1);

            if(map.size() > 2){
                map.put(arr[windowStart] , map.get(arr[windowStart]) - 1);
                if(map.get(arr[windowStart]) == 0){
                    map.remove(arr[windowStart]);
                }
                windowStart++;
            }
            maxLen = Math.max(maxLen , windowEnd - windowStart + 1);
        }
        return maxLen;
    }
}
