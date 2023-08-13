package org.example.leetcode;

public class PlusOne {
//    public int[] plusOne(int[] digits) {
//        int[]ans = new int[digits.length + 1];
//        for(int i = digits.length - 1 ; i >= 0 ; i--){
//            if(digits[i] < 9){
//                digits[i]++;
//                return digits;
//            }
//            digits[i] = 0;
//        }
//        ans[0] = 1;
//        return ans;
//    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1 ; i >= 0 ; i--){
            int curr = digits[i] + carry;
            if(curr >= 10){
                carry = 1;
                digits[i] = curr % 10;
            }
            else{
                carry = 0;
                digits[i] = curr;
            }
        }

        int result[] = new int[digits.length + 1];
        if(carry == 0){
            return digits;
        }
        else{
            result[0] = 1;
            return result;
        }

    }
}
