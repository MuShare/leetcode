package org.mushare.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnList {

    int findAllPositiveNumbersAndSumIntegerPart(Double[] nums) {
        return Arrays.asList(nums)
                .stream()
                .filter(num -> num > 0)
                .mapToInt(num -> num.intValue())
                .reduce(0, (n1, n2) -> n1 + n2);
    }

    int getAveGrade(List<Person> persons, int classNo) {
        List<Integer> grades = persons.stream()
                .filter(person -> person.getClassNo() == classNo)
                .map(person -> person.getGrade())
                .collect(Collectors.toList());
        return (int) Math.round((double)grades.stream().reduce(0,(n1, n2) -> n1 + n2)/ grades.size());
    }

}
