package org.mushare.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LearnListTest {

    private LearnList learnList = new LearnList();

    @Test
    public void testFindAllPositiveNumbersAndSumIntegerPart() {
        Assert.assertEquals(learnList.findAllPositiveNumbersAndSumIntegerPart(new Double[] {-1.1, 0.0, 1.2, 2.6}), 3);
    }

    @Test void testCalculateAvgGrade() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, 97));
        persons.add(new Person(3, 87));
        persons.add(new Person(2, 100));
        persons.add(new Person(3, 89));
        persons.add(new Person(3, 99));
        persons.add(new Person(2, 77));
        persons.add(new Person(1, 67));
        persons.add(new Person(1, 90));
        
    }
}
