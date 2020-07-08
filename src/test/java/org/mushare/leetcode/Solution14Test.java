package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution14Test {

    private Solution14 solution14 = new Solution14();

    @Test
    public void test(){
        Assert.assertTrue(solution14.longestCommonPrefix(new String[] {"flower","flow","flight"}).equals("fl"));
        Assert.assertTrue(solution14.longestCommonPrefix(new String[] {"dog","racecar","car"}).equals(""));
    }
}
