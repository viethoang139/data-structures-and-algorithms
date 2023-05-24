package org.example.leetcode;

public class FindTheKBeautyOfANumber {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String value = String.valueOf(num);
        for(int i = 0 ; i < value.length()-k+1 ; i++){
            String temp = value.substring(i , i+k);
            int ans = Integer.valueOf(temp);

            if(ans == 0){
                continue;
            }
            if(num % ans == 0){
                count++;
            }


        }
        return count;
    }
}
