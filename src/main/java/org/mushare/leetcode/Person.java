package org.mushare.leetcode;

public class Person {
    private int classNo;
    private int grade;

    public Person(int classNo, int grade) {
        this.classNo = classNo;
        this.grade = grade;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
