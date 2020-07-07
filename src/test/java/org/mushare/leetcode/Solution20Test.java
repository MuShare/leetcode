package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution20Test {

    private Solution20 solution20 = new Solution20();

    @Test
    public void testTrue() {
        Assert.assertTrue(solution20.isValid("()"));
        Assert.assertTrue(solution20.isValid("()[]{}"));
        Assert.assertTrue(solution20.isValid("{[]}"));
    }

    @Test
    public void testFalse() {
        Assert.assertFalse(solution20.isValid("(]"));
        Assert.assertFalse(solution20.isValid("([)]"));
        Assert.assertFalse(solution20.isValid("]"));
    }

}
