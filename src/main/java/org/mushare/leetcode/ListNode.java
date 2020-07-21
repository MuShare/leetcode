package org.mushare.leetcode;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public boolean equals(ListNode node) {
        ListNode _this = this;
        ListNode _node = node;
        while (_this != null && _node != null) {
            if (_this.val != _node.val) {
                return false;
            }
            _node = _node.next;
            _this = _this.next;
        }
        return _this == null && _node == null;
    }

    @Override
    public String toString() {
        if (this == null) {
            return "null";
        }
        return val + " -> " + (next == null ? "null" : next.toString());
    }


    public static ListNode create(int val) {
        return new ListNode(val);
    }

    public ListNode add(int val) {
        if (next == null) {
            next = new ListNode(val);
            return this;
        }
        ListNode tmp = next;
        while (true) {
            if (tmp.next == null) {
                tmp.next = new ListNode(val);
                break;
            }
            tmp = tmp.next;
        }
        return this;
    }
}
