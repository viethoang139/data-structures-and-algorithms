package org.example.leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    // Time: O(n)
    // Space: O(n)
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length() ;i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if(stack.peek() == s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String str = sb.reverse().toString();
        return str;

    }
}
