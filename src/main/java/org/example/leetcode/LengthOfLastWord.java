package org.example.leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        return str[str.length -1].length();

    }
}
