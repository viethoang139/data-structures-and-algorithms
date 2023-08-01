package org.example.leetcode;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        stack.push(-1);
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.size() == 0){
                    stack.push(i);
                }
                else{
                    ans = Math.max(ans , i - stack.peek());
                }
            }
        }
        return ans;
    }
}

