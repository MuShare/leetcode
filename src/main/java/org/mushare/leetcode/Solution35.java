package org.mushare.leetcode;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        if (target > nums[nums.length - 1]) {
            i += 1;
        }
        while (i < nums.length) {
            if (target <= nums[i]) {
                break;
            }
            i++;
        }
        return i;
    }
}
