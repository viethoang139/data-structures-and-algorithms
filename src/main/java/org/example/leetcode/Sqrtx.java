package org.example.leetcode;

public class Sqrtx {

    // Time: O(logn)
    // Space: O(1)
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int ans = -1;
        int s =1, e = x;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid == x/mid){
                return mid;
            }
            else if(mid < x/mid){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
}
