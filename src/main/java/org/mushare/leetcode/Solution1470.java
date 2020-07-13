package org.mushare.leetcode;

public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            if (i < n) {
                result[i * 2] = nums[i];
            } else {
                result[(i - n) * 2 + 1] = nums[i];
            }
        }
        return result;
    }
}

