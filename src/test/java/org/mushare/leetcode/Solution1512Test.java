package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution1512Test {

    private Solution1512 solution1512 = new  Solution1512();

    @Test
    public void test(){
        Assert.assertEquals(solution1512.numIdenticalPairs(new int[]{1,2,3,1,1,3}),4);
        Assert.assertEquals(solution1512.numIdenticalPairs(new int[]{1,1,1,1}),6);
        Assert.assertEquals(solution1512.numIdenticalPairs(new int[]{1,2,3}),0);
    }
}
