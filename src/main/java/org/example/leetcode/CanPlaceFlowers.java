package org.example.leetcode;

public class CanPlaceFlowers {
    // Time: O(n)
    // Space: O(1)
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0 ; i < flowerbed.length ;i++){
            if(flowerbed[i] == 0){
                boolean emptyLeft = (i - 1 < 0 || flowerbed[i - 1] == 0);
                boolean emptyRight = (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0);
                if(emptyLeft && emptyRight){
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count >= n;
    }
}
