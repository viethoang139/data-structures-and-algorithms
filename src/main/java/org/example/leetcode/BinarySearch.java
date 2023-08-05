package org.example.leetcode;

public class BinarySearch {
    // Time: O(log(n))
    // Space: O(1)
    public int search(int[] nums, int target) {
        int lowerBound = 0;
        int upperBound = nums.length - 1;
        int midPoint;
        int index = -1;
        while (lowerBound <= upperBound) {
            midPoint = (lowerBound + upperBound) / 2;
            if (nums[midPoint] == target) {
                index = midPoint;
                break;
            } else {
                if (nums[midPoint] < target) {
                    lowerBound = midPoint + 1;
                } else {
                    upperBound = midPoint - 1;
                }
            }
        }
        return index;
    }
}
