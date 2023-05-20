package org.example.leetcode;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+str1)){
            return "";
        }
        int gcdVal = gcd(str1.length() , str2.length());
        return str2.substring(0,gcdVal);
    }
    int gcd(int num1 , int num2){
        if(num2 == 0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
}
