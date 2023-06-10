package org.example.leetcode;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1 , r = 1;
        for(int pile : piles){
            r = Math.max(r , pile);
        }
        while(l < r){
            int k = l + (r-l)/2;
            int sum = 0;
            for(int pile : piles){
                sum += Math.ceil((double)pile / k);
            }
            if(sum <= h){
                r = k;
            }
            else{
                l = k + 1;
            }
        }
        return r;
    }
}
