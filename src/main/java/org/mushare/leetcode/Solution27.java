package org.mushare.leetcode;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int result = nums.length;
        while (i < result) {
            if (val == nums[i]) {
                nums[i] = nums[result - 1];
                result--;
            }else{
                i++;
            }
        }
        return result;
    }
}
