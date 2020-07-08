package org.mushare.leetcode;

public class Solution13 {
    public int romanToInt(String s) {
        int romanToInt = 0;
        for (int index = 0; index < s.length(); index++) {
            switch (s.charAt(index)) {
                case 'I':
                    if (index < s.length() - 1 && s.charAt(index + 1) == 'V') {
                        romanToInt = romanToInt + 4;
                        index++;
                    } else if (index < s.length() - 1 && s.charAt(index + 1) == 'X') {
                        romanToInt = romanToInt + 9;
                        index++;
                    } else {
                        romanToInt = romanToInt + 1;
                    }
                    break;
                case 'X':
                    if (index < s.length() - 1 && s.charAt(index + 1) == 'L') {
                        romanToInt = romanToInt + 40;
                        index++;
                    } else if (index < s.length() - 1 && s.charAt(index + 1) == 'C') {
                        romanToInt = romanToInt + 90;
                        index++;
                    } else {
                        romanToInt = romanToInt + 10;
                    }
                    break;

                case 'C':
                    if (index < s.length() - 1 && s.charAt(index + 1) == 'D') {
                        romanToInt = romanToInt + 400;
                        index++;
                    } else if (index < s.length() - 1 && s.charAt(index + 1) == 'M') {
                        romanToInt = romanToInt + 900;
                        index++;
                    } else {
                        romanToInt = romanToInt + 100;
                    }
                    break;

                case 'V':
                    romanToInt = romanToInt + 5;
                    break;

                case 'L':
                    romanToInt = romanToInt + 50;
                    break;

                case 'D':
                    romanToInt = romanToInt + 500;
                    break;

                case 'M':
                    romanToInt = romanToInt + 1000;
                    break;
            }
        }
        return romanToInt;
    }
}
