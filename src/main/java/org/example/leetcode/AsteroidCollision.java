package org.example.leetcode;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i =0 ; i < asteroids.length ; i++){
            if(asteroids[i] > 0){
                stack.push(asteroids[i]);
            }
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && Math.abs(asteroids[i]) > stack.peek()){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(asteroids[i]);
                }
                else if(asteroids[i] + stack.peek() == 0){
                    stack.pop();
                }
            }
        }
        int[]ans = new int[stack.size()];
        for(int i = ans.length - 1 ; i>=0 ;i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}
