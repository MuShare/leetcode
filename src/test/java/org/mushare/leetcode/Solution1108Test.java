package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution1108Test {

    private Solution1108 solution1108 = new Solution1108();

    @Test
    public void test(){
        Assert.assertEquals(solution1108.defangIPaddr( "1.1.1.1"),"1[.]1[.]1[.]1");
        Assert.assertEquals(solution1108.defangIPaddr( "255.100.50.0"),"255[.]100[.]50[.]0");
    }

}
