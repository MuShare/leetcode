package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution1480Test {

    private Solution1480 solution1480 = new Solution1480();

    @Test
    public void test(){
        Assert.assertArrayEquals(solution1480.runningSum(new int[]{1,2,3,4}),new int[]{1,3,6,10});
        Assert.assertArrayEquals(solution1480.runningSum(new int[]{1,1,1,1,1}),new int[]{1,2,3,4,5});
        Assert.assertArrayEquals(solution1480.runningSum(new int[]{3,1,2,10,1}),new int[]{3,4,6,16,17});

    }

}
