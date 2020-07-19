package org.mushare.leetcode;

public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i += 1 - j;
                j = 0;
            }
        }
        if (j != needle.length()) {
            return -1;
        }
        i = i - j;
        return i;
    }
}
