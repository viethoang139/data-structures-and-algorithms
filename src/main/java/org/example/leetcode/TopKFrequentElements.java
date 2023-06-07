package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[]arr = new int[k];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq
                = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            pq.add(it);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int i = k;
        while(!pq.isEmpty()){
            arr[--i] = pq.poll().getKey();
        }

        return arr;

    }
}
