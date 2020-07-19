package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution38Test {

    private Solution38 solution38 = new Solution38();

    @Test
    public void test(){
        Assert.assertEquals(solution38.searchInsert(new int[]{1,3,5,6},5),2);
        Assert.assertEquals(solution38.searchInsert(new int[]{1,3,5,6},2),1);
        Assert.assertEquals(solution38.searchInsert(new int[]{1,3,5,6},7),4);
        Assert.assertEquals(solution38.searchInsert(new int[]{1,3,5,6},0),0);
    }
}
