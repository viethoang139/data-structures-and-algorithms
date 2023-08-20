package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String str = "123456789";
        for(int i = 1 ; i <= 9 ;i++){
            for(int j = 0 ; i + j <= 9 ; j++){
                String temp = str.substring(j , i + j);
                int value = Integer.valueOf(temp);
                if(value >= low && value <= high){
                    list.add(value);
                }
            }
        }
        return list;
    }
}
