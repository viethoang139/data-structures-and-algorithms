package org.example.leetcode;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[]arr = new int[128];

        int L = 0 , R = 0;

        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        for(char item : t_arr){
            arr[item]++;
        }

        String ans = "";
        int minLen = Integer.MAX_VALUE;
        int count = 0;
        while(R < s.length()){
            char currChar = s_arr[R];
            if(--arr[currChar] >= 0){
                count++;
            }
            while(count == t.length()){
                int currLen = R - L + 1;
                if(currLen < minLen){
                    minLen = currLen;
                    ans = s.substring(L , R + 1);
                }
                char leftChar = s_arr[L];

                if(++arr[leftChar] > 0){
                    count--;
                }
                L++;
            }
            R++;
        }
        return ans;
    }
}
