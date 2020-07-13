package org.mushare.leetcode;

public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        return S.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .filter(s -> J.contains(s))
                .map(s -> 1)
                .reduce(0, (n1, n2) -> n1 + n2);
    }
}
