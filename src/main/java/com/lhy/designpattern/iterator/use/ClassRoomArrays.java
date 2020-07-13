package com.lhy.designpattern.iterator.use;

/**
 * 教师类
 */
public class ClassRoomArrays implements Aggregate {

    private Student[] students;

    /**
     * 相当于数组的长度
     */
    private int last = 0;

    public ClassRoomArrays(int size) {
        this.students = new Student[size];
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public void addStudent(Student student) {
        this.students[last] = student;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new ClassRoomArraysIterator(this);
    }
}
