package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution13Test {

    private Solution13 solution13 = new Solution13();

    @Test
    public void test(){
        Assert.assertEquals(solution13.romanToInt("III"),3);
        Assert.assertEquals(solution13.romanToInt("IV"),4);
        Assert.assertEquals(solution13.romanToInt("IX"),9);
        Assert.assertEquals(solution13.romanToInt("LVIII"),58);
        Assert.assertEquals(solution13.romanToInt("MCMXCIV"),1994);
    }
}
