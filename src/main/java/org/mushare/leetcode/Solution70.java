package org.mushare.leetcode;

public class Solution70 {
    public int climbStairs(int n) {
        int result = 0;
        int i = 1;
        int j = 2;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        for (int m = 3; m <= n; m++) {
            result = i + j;
            i = j;
            j = result;
        }
        return result;
    }
}
