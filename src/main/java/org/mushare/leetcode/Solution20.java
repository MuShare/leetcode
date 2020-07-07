package org.mushare.leetcode;

import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case ')':
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(')');
                    }
                    break;
                case ']':
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(']');
                    }
                    break;
                case '}':
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push('}');
                    }
                    break;
                default:
                    stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
