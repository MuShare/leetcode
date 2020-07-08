package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution7Test {

    private Solution7 solution7 = new Solution7();

    @Test
    public void test() {
        Assert.assertEquals(solution7.reverse(123),321);
        Assert.assertEquals(solution7.reverse(-123),-321);
        Assert.assertEquals(solution7.reverse(120),21);
        Assert.assertEquals(solution7.reverse(998989989),989989899);
    }
}
