package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution70Test {
    private Solution70 solution70 = new Solution70();

    @Test
    public void test(){
        Assert.assertEquals(solution70.climbStairs(2),2);
        Assert.assertEquals(solution70.climbStairs(3),3);
    }
}
