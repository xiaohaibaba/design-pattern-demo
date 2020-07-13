package com.lhy.designpattern.iterator.nouse;

import java.util.Arrays;

/**
 * 教师类
 */
public class ClassRoomArrays {

    private Student[] students;

    public ClassRoomArrays(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
