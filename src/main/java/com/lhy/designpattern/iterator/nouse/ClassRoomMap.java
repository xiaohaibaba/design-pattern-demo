package com.lhy.designpattern.iterator.nouse;

import java.util.Arrays;
import java.util.Map;

/**
 * 教师类
 */
public class ClassRoomMap {

    private Map<String,Student> students;

    public ClassRoomMap(Map<String, Student> students) {
        this.students = students;
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoomMap{" +
                "students=" + students +
                '}';
    }
}
