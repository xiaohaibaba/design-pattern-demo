package com.lhy.designpattern.iterator.use;

import java.util.ArrayList;
import java.util.List;

/**
 * 教师类
 */
public class ClassRoomList implements Aggregate {

    private List<Student> students;

    /**
     * 相当于数组的长度
     */
    private int last = 0;

    public ClassRoomList(int size) {
        this.students = new ArrayList<>(size);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void addStudent(Student student) {
        this.students.add(last,student);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new ClassRoomListIterator(this);
    }
}
