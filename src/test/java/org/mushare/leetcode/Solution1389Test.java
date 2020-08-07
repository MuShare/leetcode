package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution1389Test {
    private Solution1389 solution1389=new Solution1389();

    @Test
    public void Test(){
        Assert.assertArrayEquals(solution1389.createTargetArray(new int[]{0,1,2,3,4},new int[]{0,1,2,2,1}),new int[]{0,4,1,3,2});
        Assert.assertArrayEquals(solution1389.createTargetArray(new int[]{1,2,3,4,0},new int[]{0,1,2,3,0}),new int[]{0,1,2,3,4});
        Assert.assertArrayEquals(solution1389.createTargetArray(new int[]{1},new int[]{0}),new int[]{1});
    }
}
