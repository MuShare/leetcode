package org.mushare.leetcode;

import java.util.Arrays;
import java.util.List;

public class LearnList {

    int findAllPositiveNumbersAndSumIntegerPart(Double [] nums) {
        return Arrays.asList(nums)
                .stream()
                .filter(num -> num > 0)
                .mapToInt(num -> num.intValue())
                .reduce(0, (n1, n2) -> n1 + n2);
    }

    int getAveGrade(List<Person> persons, int classNo) {
        return 0;
    }
}
