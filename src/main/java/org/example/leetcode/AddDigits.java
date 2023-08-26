package org.example.leetcode;

public class AddDigits {
    // Time: O(n)
    // Space: O(n)
    public int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        int sum = sumOfDigits(num);
        if(lengthOfDigits(sum) == 1){
            return sum;
        }
        else{
            return addDigits(sum);
        }
    }

    public int lengthOfDigits(int num){
        int count = 0;
        while(num != 0){
            count++;
            num /= 10;
        }
        return count;
    }

    public int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            int temp = num % 10;
            sum += temp;
            num /= 10;
        }
        return sum;
    }
}
