package org.example.leetcode;

public class Problem1287 {
    public int findSpecialInteger(int[] arr) {
        // solution 1: using hash map
        // Time: O(n) Space: O(n)
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i = 0; i < arr.length; i++){
        //     map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        // }
        // int ans = 0;
        // for(int key: map.keySet()){
        //     int value = map.get(key);
        //     if(value > (arr.length)*0.25){
        //         ans = key;
        //         break;
        //     }
        // }
        // return ans;

        // solution 2:

        int size = arr.length / 4;

        for(int i = 0; i < arr.length - size; i++){
            if(arr[i] == arr[i + size]){
                return arr[i];
            }
        }
        return -1;


    }
}
