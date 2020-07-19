package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution28Test {
    private Solution28 solution28= new Solution28();

    @Test
    public void test(){
        Assert.assertEquals(solution28.strStr("hello","ll"),2);
        Assert.assertEquals(solution28.strStr("aaaaa","bba"),-1);
        Assert.assertEquals(solution28.strStr("mississippi","issip"),4);
        Assert.assertEquals(solution28.strStr("mississippi","is"),1);
    }
}
