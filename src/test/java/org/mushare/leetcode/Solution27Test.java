package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution27Test {

    private Solution27 solution27 =new Solution27();

    @Test
    public void Test(){
        Assert.assertEquals(solution27.removeElement(new int[]{0,1,2,2,3,0,4,2},2),5);
        Assert.assertEquals(solution27.removeElement(new int[]{3,2,2,3},3),2);
    }

}
