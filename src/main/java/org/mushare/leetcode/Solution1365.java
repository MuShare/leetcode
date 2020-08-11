package org.mushare.leetcode;

public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    tmp++;
                }
            }
            result[i] = tmp;
            tmp = 0;
        }
        return result;
    }
}