package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution38Test {
    private Solution38 solution38 = new Solution38();

    @Test
    public void tset(){
        Assert.assertEquals(solution38.countAndSay(1),"1");
        Assert.assertEquals(solution38.countAndSay(2),"11");
        Assert.assertEquals(solution38.countAndSay(4),"1211");
    }
}
