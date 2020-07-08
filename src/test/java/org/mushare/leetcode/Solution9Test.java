package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution9Test {

    private Solution9 solution9 = new Solution9();

    @Test
    public void testTrue(){
        Assert.assertTrue(solution9.isPalindrome(121));
    }

    @Test
    public void testFalse(){
        Assert.assertFalse(solution9.isPalindrome(-121));
        Assert.assertFalse(solution9.isPalindrome(10));
    }
}
