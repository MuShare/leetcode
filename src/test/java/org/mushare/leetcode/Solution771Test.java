package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution771Test {

    private Solution771 solution771 = new Solution771();

    @Test
    public void test() {
        Assert.assertEquals(solution771.numJewelsInStones("aA", "aAAdds"), 3);
    }
}
