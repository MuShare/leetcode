package org.mushare.leetcode;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int result = nums.length;
        while (i < result - 1) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 2; j < result; j++) {
                    nums[j - 1] = nums[j];
                }
                result--;
            } else {
                i++;
            }
        }
        return result;
    }
}
