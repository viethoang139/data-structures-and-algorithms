package org.example.leetcode;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;

    }

    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int temp = num % 10;
            ans += temp*temp;
            num/=10;
        }
        return ans;
    }

}
