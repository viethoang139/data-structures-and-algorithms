package org.example.leetcode;

public class SortColor {
    public void sortColors(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }
            else if(arr[i] == 2){
                count2++;
            }
        }
        int i = 0;
        while(count0 > 0){
            arr[i++] = 0;
            count0--;
        }

        while(count1 > 0){
            arr[i++] = 1;
            count1--;
        }
        while(count2 > 0){
            arr[i++] =2;
            count2--;
        }

    }
}
