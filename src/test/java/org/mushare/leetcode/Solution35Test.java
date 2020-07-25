package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution35Test {

    private Solution35 solution35 = new Solution35();

    @Test
    public void test(){
        Assert.assertEquals(solution35.searchInsert(new int[]{1,3,5,6},5),2);
        Assert.assertEquals(solution35.searchInsert(new int[]{1,3,5,6},2),1);
        Assert.assertEquals(solution35.searchInsert(new int[]{1,3,5,6},7),4);
        Assert.assertEquals(solution35.searchInsert(new int[]{1,3,5,6},0),0);
    }
}
