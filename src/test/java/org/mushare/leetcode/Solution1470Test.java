package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution1470Test {

    private Solution1470 solution1470 = new Solution1470();

    @Test
    public void test() {
        Assert.assertArrayEquals(
                solution1470.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4),
                new int[]{1, 4, 2, 3, 3, 2, 4, 1}
        );

        Assert.assertArrayEquals(
                solution1470.shuffle(new int[]{1,1,2,2}, 2),
                new int[]{1,2,1,2}
        );
    }
}

