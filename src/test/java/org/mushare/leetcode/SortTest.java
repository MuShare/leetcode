package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

    private Sort sort = new Sort();

    @Test
    public void testBubbleSort() {
        Assert.assertArrayEquals(sort.bubbleSort(new int[]{5, 1, 4, 3, 2, 7, 6}), new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertArrayEquals(sort.bubbleSort(new int[]{5, 1, 4, 3, 2, 7, 6, 6}), new int[]{1, 2, 3, 4, 5, 6, 6, 7});
    }
}
