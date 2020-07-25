package org.mushare.leetcode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = null, tmp = null;
        int n = 0;
        int i = 0;
        while (l1 != null && l2 != null) {
            n = l1.val + l2.val + i;
            if (n > 9) {
                i = 1;
                n -= 10;
            } else {
                i = 0;
            }
            if (tmp == null) {
                result = tmp = new ListNode(n);
            } else {
                tmp.next = new ListNode(n);
                tmp = tmp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode last = null;
        if (l1 != null) {
            last = l1;
        }
        if (l2 != null) {
            last = l2;
        }
        if (last == null) {
            if (i == 0) {
                return result;
            }
            tmp.next = new ListNode(i);
            return result;
        }
        while (last != null) {
            n = last.val + i;
            if (n > 9) {
                i = 1;
                n -= 10;
            } else {
                i = 0;
            }
            tmp.next = new ListNode(n);
            tmp = tmp.next;
            last = last.next;
        }
        if (i != 0) {
            tmp.next = new ListNode(i);
        }
        return result;
    }
}