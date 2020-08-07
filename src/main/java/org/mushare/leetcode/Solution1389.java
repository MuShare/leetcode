package org.mushare.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i) {
                for (int j = result.length - 1; j > index[i]; j--) {
                    result[j] = result[j - 1];
                }
            }
            result[index[i]] = nums[i];
        }
        return result;
    }
}
