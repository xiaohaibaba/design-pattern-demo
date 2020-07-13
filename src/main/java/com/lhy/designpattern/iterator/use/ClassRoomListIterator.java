package com.lhy.designpattern.iterator.use;

/**
 * 教师类迭代器
 */
public class ClassRoomListIterator implements Iterator {

    private ClassRoomList classRoom;
    private int index;

    public ClassRoomListIterator(ClassRoomList classRoom) {
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
