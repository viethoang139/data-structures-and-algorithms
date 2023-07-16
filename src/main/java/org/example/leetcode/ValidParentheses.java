package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    // solution 1
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0 ; i < s.length() ; i++){
//            if(s.charAt(i) == '('){
//                stack.push(')');
//            }
//
//            else if(s.charAt(i) == '['){
//                stack.push(']');
//            }
//
//            else if(s.charAt(i) == '{'){
//                stack.push('}');
//            }
//
//            else if(stack.isEmpty() || stack.pop() != s.charAt(i)){
//                return false;
//            }
//        }
//        return stack.isEmpty();
//    }

    // solution 2
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character , Character> map = new HashMap<>(3);
        map.put(')' , '(');
        map.put(']' , '[');
        map.put('}' , '{');
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty() && map.get(c) == stack.peek()){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
