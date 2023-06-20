package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        char[]arr = s.toCharArray();
        int[]cache = new int[128];
        for(int i = 0 ; i < s.length() ; i++){
            char ch = arr[i];
            cache[ch] = i;
        }
        List<Integer> list = new ArrayList<>();
        int L = 0 , R = 0 , index = 0;
        while(index < s.length()){
            char curr = arr[index];
            R = Math.max(R , cache[curr]);
            if(index == R){
                int size = R - L + 1;
                list.add(size);
                R++;
                L = R;
            }
            index++;
        }
        return list;
    }
}
