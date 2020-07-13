package org.mushare.leetcode;

public class Solution1342 {
    public int numberOfSteps(int num) {
        int i = 0;
        while (num != 0) {
            /**
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
             */
            num = (num % 2 == 0) ? num / 2 : (num - 1);
            i++;
        }
        return i;
    }
}
