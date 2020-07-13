package com.lhy.designpattern.iterator.nouse;

import java.util.HashMap;
import java.util.Map;

public class MainTest {

    public static void main(String[] args) {
        Student s1 = new Student("小明");
        Student s2 = new Student("小王");

        Student[] students= new Student[2];
        students[0] = s1;
        students[1] = s2;

        ClassRoomArrays classRoom = new ClassRoomArrays(students);
        Student[] students1 = classRoom.getStudents();
        for (Student student : students1) {
            System.out.println(student);
        }

        Map<String, Student> map = new HashMap<>();
        map.put(s1.getName(), s1);
        map.put(s2.getName(), s2);
        ClassRoomMap maps = new ClassRoomMap(map);

        Map<String, Student> students2 = maps.getStudents();

        for (Student value : students2.values()) {
            System.out.println(value);
        }
    }
}
