package com.lhy.designpattern.iterator.use;

/**
 * 教师类迭代器
 */
public class ClassRoomArraysIterator implements Iterator {

    private ClassRoomArrays classRoom;
    private int index;

    public ClassRoomArraysIterator(ClassRoomArrays classRoom) {
        this.classRoom = classRoom;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        if (index < classRoom.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Student student = classRoom.getStudent(index);
        index++;
        return student;
    }

}
