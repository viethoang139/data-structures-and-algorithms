package org.example.leetcode;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] arr) {
        int[]ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                int prevDay = stack.pop();
                ans[prevDay] = i - prevDay;
            }
            stack.push(i);
        }
        return ans;
    }
}
