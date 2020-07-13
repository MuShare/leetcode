package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution1342Test {

    private Solution1342 solution1342 = new Solution1342();

    @Test
    public void test() {
        Assert.assertEquals(solution1342.numberOfSteps(14), 6);
        Assert.assertEquals(solution1342.numberOfSteps(8), 4);
        Assert.assertEquals(solution1342.numberOfSteps(123), 12);
    }
}
