package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution1365Test {

    private Solution1365 solution1365 = new Solution1365();

    @Test
    public void test(){
        Assert.assertArrayEquals(solution1365.smallerNumbersThanCurrent(new int[]{8,1,2,2,3}),new int[]{4,0,1,1,3});
        Assert.assertArrayEquals(solution1365.smallerNumbersThanCurrent(new int[]{6,5,4,8}),new int[]{2,1,0,3});
        Assert.assertArrayEquals(solution1365.smallerNumbersThanCurrent(new int[]{7,7,7,7}),new int[]{0,0,0,0});
    }
}
