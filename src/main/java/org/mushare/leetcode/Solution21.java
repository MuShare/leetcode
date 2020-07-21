package org.mushare.leetcode;

import org.w3c.dom.html.HTMLParagraphElement;

public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = l1.val < l2.val ? l1 : l2;
        while (l1 != null && l2 != null) {
            ListNode tmp;
            if (l1.val >= l2.val) {
                tmp = l1;
                l1 = l2;
                l2 = tmp;
            }

            tmp = l1.next;
            if (tmp == null) {
                l1.next = l2;
                break;
            }
            if (tmp.val < l2.val) {
                l1 = tmp;
            } else {
                l1.next = l2;
                l1 = tmp;
            }
        }
        return result;
    }
}
