package org.mushare.leetcode;

public class Solution38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String lastResult = countAndSay(n - 1);
        String result = "";
        Character currentCharacter = null;
        int num = 1;
        for (char c : lastResult.toCharArray()) {
            if (currentCharacter == null) {
                currentCharacter = c;
                continue;
            }
            if (currentCharacter == c) {
                num++;
            } else {
                result += num + String.valueOf(currentCharacter);
                currentCharacter = c;
                num = 1;
            }
        }
        result += num + String.valueOf(currentCharacter);
        return result;
    }
}
