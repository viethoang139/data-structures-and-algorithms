package org.example.leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int ans = 0;
        while(start < end){
            int area = (end - start) * Math.min(height[start] , height[end]);
            ans = Math.max(ans , area);
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}
