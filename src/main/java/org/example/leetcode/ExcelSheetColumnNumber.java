package org.example.leetcode;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int pow = 1;
        int ans = 0;
        for(int i = s.length() - 1; i>=0;i--){
            ans = ans + (s.charAt(i) - 64)*pow;
            pow = pow*26;
        }
        return ans;
    }
}
