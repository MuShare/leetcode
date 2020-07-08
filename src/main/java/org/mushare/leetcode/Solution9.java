package org.mushare.leetcode;

public class Solution9 {
    public boolean isPalindrome(int x) {
        boolean isPalindrome = true;
        if (x < 0) {
            isPalindrome = false;
        } else {
            int[] nx = new int[32];
            int index = 0;
            while (x / 10 != 0) {
                nx[index] = x % 10;
                x = x / 10;
                index++;
            }
            nx[index] = x;

            int length = index;
            while (index != length / 2) {
                if (nx[index] != nx[length - index]) {
                    isPalindrome = false;
                    break;
                }
                index--;
            }
        }
        return isPalindrome;
    }
}
