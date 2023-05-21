package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < candies.length ; i++){
            max = Math.max(max,candies[i]);
        }
        for(int i = 0 ; i < candies.length ; i++){
            int ans = candies[i] + extraCandies;
            if(ans >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;
    }
}
