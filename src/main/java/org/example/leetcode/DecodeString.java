package org.example.leetcode;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String>  strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int num = ch - '0';
                while((i+1) < s.length() && Character.isDigit(s.charAt(i+1))){
                    num = num*10 + s.charAt(i+1) - '0';
                    i++;
                }
                numStack.push(num);
            }
            else if(ch == '['){
                strStack.push(sb.toString());
                sb = new StringBuilder();
            }
            else if(ch == ']'){
                int k = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for(int j = 0 ; j < k ; j++){
                    temp.append(sb);
                }
                sb = temp;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
