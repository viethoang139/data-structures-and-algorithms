package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsbySign {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(arr[i] >= 0){
                list1.add(arr[i]);
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < 0){
                list2.add(arr[i]);
            }
        }
        int i = 0 , j = 0;
        List<Integer> list3 = new ArrayList<>();
        while(i < list1.size() && j < list2.size()){
            list3.add(list1.get(i));
            list3.add(list2.get(j));
            i++;
            j++;
        }
        while(i < list1.size()){
            list3.add(list1.get(i));
            i++;
        }
        while(j < list2.size()){
            list3.add(list2.get(j));
            j++;
        }
        int[]ans = new int[n];
        for(int item = 0 ; item < list3.size() ; item++){
            ans[item] = list3.get(item);
        }
        return ans;
    }
}
