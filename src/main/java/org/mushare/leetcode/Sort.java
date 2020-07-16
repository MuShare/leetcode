package org.mushare.leetcode;

public class Sort {
    public int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int x = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = x;
                }
            }
        }
        return nums;
    }

    public int[] quickSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int i = 0, j = nums.length - 1;
        int key = nums[0];
        while (i != j) {
            if (nums[i] < nums[j]) {
                j--;
            } else {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
        }
        int[] smallNums = new int[i + 1];
        int[] bigNums = new int[nums.length - i - 1];
        for (int k = 0; k < nums.length; k++) {
            if (k <= i) {
                smallNums[k] = nums[k];
            } else {
                bigNums[k - i - 1] = nums[k];
            }
        }
        if (smallNums.length == 0) {
            return bigNums;
        }
        if (bigNums.length == 0) {
            return smallNums;
        }
        smallNums = quickSort(smallNums);
        bigNums = quickSort(bigNums);
        for (int k = 0; k < nums.length; k ++) {
            if (k <= i) {
                nums[k] = smallNums[k];
            } else {
                nums[k] = bigNums[k - i - 1];
            }
        }
        return nums;
    }

}
