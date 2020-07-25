package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution2Test {
    private Solution2 solution2 = new Solution2();

    @Test
    public void test() {
        ListNode l1 = ListNode.create(2).add(4).add(3);
        ListNode l2 = ListNode.create(5).add(6).add(4);
        ListNode result = ListNode.create(7).add(0).add(8);
        ListNode l = solution2.addTwoNumbers(l1, l2);
        System.out.println(l);
        Assert.assertTrue(l.equals(result));

    }
    @Test
    public void test1(){
        ListNode l1 = ListNode.create(2).add(4).add(3);
        ListNode l2 = ListNode.create(5).add(6).add(4).add(5);
        ListNode result = ListNode.create(7).add(0).add(8).add(5);
        ListNode l = solution2.addTwoNumbers(l1, l2);
        System.out.println(l);
        Assert.assertTrue(l.equals(result));
    }

    @Test
    public void test2(){
        ListNode l1 = ListNode.create(5);
        ListNode l2 = ListNode.create(5);
        ListNode result = ListNode.create(0).add(1);
        ListNode l = solution2.addTwoNumbers(l1, l2);
        System.out.println(l);
        Assert.assertTrue(l.equals(result));
    }

    @Test
    public void test3(){
        ListNode l1 = ListNode.create(1);
        ListNode l2 = ListNode.create(9).add(9);
        ListNode result = ListNode.create(0).add(0).add(1);
        ListNode l = solution2.addTwoNumbers(l1, l2);
        System.out.println(l);
        Assert.assertTrue(l.equals(result));
    }

    @Test
    public void test4(){
        ListNode l1 = ListNode.create(2);
        ListNode l2 = ListNode.create(8).add(9).add(9);
        ListNode result = ListNode.create(0).add(0).add(0).add(1);
        ListNode l = solution2.addTwoNumbers(l1, l2);
        System.out.println(l);
        Assert.assertTrue(l.equals(result));
    }
}
