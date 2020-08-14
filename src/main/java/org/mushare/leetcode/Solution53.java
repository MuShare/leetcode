package org.mushare.leetcode;

public class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;
            for (int j = i; j < nums.length; j++) {
                tmp = tmp + nums[j];
                if (result < tmp) {
                    result = tmp;
                }
            }
        }
        return result;
    }
}
