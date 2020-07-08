package org.mushare.leetcode;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }
        for (int i = 0; i < minLength; i++) {
            char x = strs[0].charAt(i);
            boolean flag = true;
            for (String str : strs) {
                if (str.charAt(i) != x) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                prefix = prefix + x;
            } else {
                break;
            }
        }
        return prefix;
    }
}
