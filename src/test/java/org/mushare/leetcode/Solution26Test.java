package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution26Test {

    private Solution26 solution26 = new Solution26();

    @Test
    public void test(){
        Assert.assertEquals(solution26.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}),5);
    }
}
