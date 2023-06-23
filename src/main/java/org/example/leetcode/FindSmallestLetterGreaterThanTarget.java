package org.example.leetcode;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length - 1] <= target || target < letters[0]){
            return letters[0];
        }

        int L = 0 , R = letters.length - 1;
        while(L + 1 < R){
            int mid = L + (R - L)/2;
            if(letters[mid] > target){
                R = mid;
            }
            else{
                L = mid;
            }
        }
        return letters[R];
    }
}
