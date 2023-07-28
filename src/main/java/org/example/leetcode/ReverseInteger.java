package org.example.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        int revesed = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while(x != 0){
            int lastDigit = x % 10;

            if(revesed > max/10 || (revesed == max/10 && lastDigit > 7)){
                return 0;
            }

            if(revesed < min/10 || (revesed == min/10 && lastDigit < -8)){
                return 0;
            }

            revesed = revesed*10 + lastDigit;
            x /=10;

        }
        return revesed;
    }
}
