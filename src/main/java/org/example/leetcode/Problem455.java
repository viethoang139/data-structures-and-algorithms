package org.example.leetcode;

import java.util.Arrays;

public class Problem455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int count = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
