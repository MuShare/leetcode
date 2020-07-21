package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution21Test {
    private Solution21 solution21 = new Solution21();

    @Test
    public void test(){
        ListNode l1 = ListNode.create(1).add(2).add(4);
        ListNode l2 = ListNode.create(1).add(3).add(4);
        ListNode result = new ListNode(1, new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(4,null))))));
        ListNode l = solution21.mergeTwoLists(l1,l2);
        Assert.assertTrue(l.equals(result));
    }

    @Test
    public void test2Null(){
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode result = null;
        ListNode l = solution21.mergeTwoLists(l1,l2);
        Assert.assertNull(l);
    }

    @Test
    public void test1Null() {
        ListNode l1 = null;
        ListNode l2 = new ListNode(0);
        ListNode result = new ListNode(0);
        ListNode l = solution21.mergeTwoLists(l1, l2);
        Assert.assertTrue(l.equals(result));
    }

    @Test
    public void test3(){
        ListNode l2 = ListNode.create(5);
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode result = new ListNode(1, new ListNode(2, new ListNode(4,new ListNode(5))));
        ListNode l = solution21.mergeTwoLists(l1,l2);
        Assert.assertTrue(l.equals(result));
    }

    @Test
    public void test4(){
        ListNode l1 =
                new ListNode(-9,
                new ListNode(-7,
                        new ListNode(-3,
                                new ListNode(-3,
                                        new ListNode(-1,
                                                new ListNode(2,
                                                        new ListNode(3)))))));
        ListNode l2 = new ListNode(-7,
                new ListNode(-7,
                        new ListNode(-6,
                                new ListNode(-6,
                                        new ListNode(-5,
                                                new ListNode(-3,
                                                        new ListNode(2,
                                                                new ListNode(4))))))));

        ListNode result = solution21.mergeTwoLists(l1,l2);

        System.out.println(result.toString());
        Assert.assertEquals(
                result.toString(),
                "-9 -> -7 -> -7 -> -7 -> -6 -> -6 -> -5 -> -3 -> -3 -> -3 -> -1 -> 2 -> 2 -> 3 -> 4 -> null"
        );
    }


    @Test
    public void testEqauls(){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        Assert.assertFalse(l1.equals(l2));

        ListNode l3 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode l4 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        Assert.assertTrue(l3.equals(l4));

        ListNode l5 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5, null))));
        Assert.assertFalse(l4.equals(l5));
    }

    @Test
    public void testToString() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        Assert.assertEquals(l1.toString(), "1 -> 2 -> 4 -> null");
    }

    @Test
    public void testAppend() {
        ListNode node = ListNode.create(1).add(2).add(4).add(5);
        Assert.assertEquals(node.toString(), "1 -> 2 -> 4 -> 5 -> null");
    }
}
