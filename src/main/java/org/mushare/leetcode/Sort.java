package org.mushare.leetcode;

public class Sort {
    public int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int x = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = x;
                }
            }
        }
        return nums;
    }
}
