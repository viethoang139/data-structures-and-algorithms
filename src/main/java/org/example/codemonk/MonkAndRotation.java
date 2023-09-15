package org.example.codemonk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonkAndRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[]arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            reverse(arr,0,n-1);
            reverse(arr , k , n - 1);
            for(int item : arr){
                System.out.print(item + " ");
            }
        }
    }

    private static void reverse(int[] arr, int l, int h) {
        while(l <= h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
}
