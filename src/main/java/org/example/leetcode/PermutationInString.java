package org.example.leetcode;

public class PermutationInString{
    public boolean checkInclusion(String s1, String s2) {
        int[]arr = new int[128];
        int L = 0 , R = 0;
        char[] s1_arr = s1.toCharArray();
        char[] s2_arr = s2.toCharArray();

        for(char item : s1_arr){
            arr[item]++;
        }

        int count = 0;
        int minLen = Integer.MAX_VALUE;
        while(R < s2.length()){
            char currChar = s2_arr[R];
            if(--arr[currChar] >= 0){
                count++;
            }

            while(count == s1.length()){
                minLen = Math.min(minLen , R - L + 1);

                char leftChar = s2_arr[L];
                if(++arr[leftChar] > 0){
                    count--;
                }
                L++;
            }
            R++;
        }
        return minLen == s1.length();

    }
}
