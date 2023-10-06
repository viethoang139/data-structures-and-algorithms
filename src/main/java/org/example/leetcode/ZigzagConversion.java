package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    // Time: O(n) + O(numRows)
    // Space: O(numRows)
    public String convert(String s, int numRows) {
        if(numRows <= 1){
            return s;
        }
        List<Character>[] list = new List[numRows];
        for(int i = 0 ; i < numRows; i++){
            list[i] = new ArrayList<>();
        }
        int row = 0;
        int step = 1;
        for(int i = 0 ; i < s.length() ; i++){
            list[row].add(s.charAt(i));
            if(row == 0){
                step = 1;
            }
            if(row == numRows - 1){
                step = -1;
            }
            row = row + step;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < numRows; i++){
            for(char character : list[i]){
                sb.append(character);
            }
        }
        return sb.toString();
    }
}
