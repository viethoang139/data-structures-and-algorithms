package org.example.leetcode;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        int[]temp = new int[nums.length];
        mergeSort(nums ,temp, 0 , nums.length - 1);
        int [] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[i];
        }
        return ans;
    }

    private void mergeSort(int[]nums, int[]temp,int low , int high){
        if(low < high){
            int mid = low + (high - low)/2;
            mergeSort(nums ,temp, low , mid);
            mergeSort(nums , temp , mid + 1 , high);
            merge(nums , temp , low , mid , high);
        }
    }

    private void merge(int[]nums , int[]temp , int low , int mid , int high){
        for(int i = low ; i <= high ; i++){
            temp[i] = nums[i];
        }
        int i = low , j = mid +1 , k = low;
        while(i <= mid && j <= high){
            if(temp[i] < temp[j]){
                nums[k] = temp[i];
                i++;
            }
            else{
                nums[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            nums[k] = temp[i];
            i++;
            k++;
        }
        while(j <= high){
            nums[k] = temp[j];
            j++;
            k++;
        }

    }
}
