package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution53Test {

    private Solution53 solution53 = new Solution53();

    @Test
    public void test(){
        Assert.assertEquals(solution53.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}),6);
    }
}
