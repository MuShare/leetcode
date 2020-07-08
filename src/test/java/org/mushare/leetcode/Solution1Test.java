package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution1Test {

    private Solution1 solution1 = new Solution1();

    @Test
    public void test() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = new int[]{0, 1};
        Assert.assertArrayEquals(solution1.twoSum(nums, 9), result);
    }
}
