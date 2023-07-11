package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseWordsInAString {
    // solution 1
//    public String reverseWords(String s) {
//        String ans = "";
//        String res = "";
//        String str = s.trim();
//        int count = 0;
//        for(int i = 0 ; i < str.length() ; i++){
//            if(str.charAt(i) == ' '){
//                if(count < 1){
//                    ans = res + ans;
//                    ans = str.charAt(i) + ans;
//                    res = "";
//                    count++;
//                }
//            }
//            else{
//                count = 0;
//                res += str.charAt(i);
//            }
//        }
//        ans = res + ans;
//        return ans;
//    }
    // solution 2: using stack
//    public String reverseWords(String s) {
//        String str = s.trim();
//        String temp = str.replaceAll("\\s+"," ");
//        String[] arr = temp.split(" ");
//        Stack<String> stack = new Stack<>();
//        for(String item : arr){
//            stack.push(item);
//        }
//        int count = 0;
//        int size = stack.size();
//        StringBuilder sb = new StringBuilder();
//        while(!stack.isEmpty()){
//            count++;
//            if(count == size){
//                sb.append(stack.pop());
//            }
//            else {
//                sb.append(stack.pop());
//                sb.append(" ");
//            }
//        }
//        return sb.toString();
//    }

    // solution 3: using two pointer
    public String reverseWords(String s) {
        int n = s.length();
        List<String> list = new ArrayList<>();
        char[]arr = s.toCharArray();
        reverseInPlace(arr , 0 , n -1);
        int i = 0;
        while(i < n){
            if(arr[i] == ' '){
                i++;
            }
            else{
                int j = getLastIndexOfWord(arr , i);
                list.add(reverse(arr , i , j));
                i = j + 1;
            }
        }
        return String.join(" " , list);
    }

    private String reverse(char[] arr , int i , int j){
        StringBuilder sb = new StringBuilder();
        while(i <= j){
            sb.append(arr[j--]);
        }
        return sb.toString();
    }

    private int getLastIndexOfWord(char[]arr , int i){
        int n = arr.length;
        while(i < n && arr[i] != ' '){
            i++;
        }
        return i -1;
    }

    private void reverseInPlace(char[]arr , int i , int j){
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
