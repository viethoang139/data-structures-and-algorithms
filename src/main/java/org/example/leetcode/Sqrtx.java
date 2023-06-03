package org.example.leetcode;

public class Sqrtx {
    public int mySqrt(int x) {
        long low = 0;
        long high = (x/2) +1;
        while(low < high){
            long mid = low + (high-low)/2 + 1;
            if(mid * mid == x){
                return (int)mid;
            }
            else if(mid *mid > x){
                high = mid - 1;
            }
            else{
                low = mid;
            }
        }
        return (int)low;
    }
}
