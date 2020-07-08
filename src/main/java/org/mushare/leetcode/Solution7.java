package org.mushare.leetcode;

public class Solution7 {
    public int reverse(int x) {
        int [] nx = new int [32];
        int index = 0;
        while (x / 10 != 0){
            nx[index] = x % 10;
            x = x / 10;
            index++;
        }
        nx[index] = x;
        x = 0;
        for (int i = 0; i <= index; i++) {
            int last = x;
            x = x * 10;
            x = x + nx[i];
            if (x / 10 != last) {
                x = 0;
                break;
            }
        }
        return x;
    }
}
