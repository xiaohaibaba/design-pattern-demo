package com.lhy.designpattern.iterator.use;

public class MainTest {
    public static void main(String[] args) {
        Student s1 = new Student("小明");
        Student s2 = new Student("小王");

        ClassRoomArrays classRoomArrays = new ClassRoomArrays(2);
        classRoomArrays.addStudent(s1);
        classRoomArrays.addStudent(s2);
        Iterator iterator1 = classRoomArrays.iterator();
        while (iterator1.hasNext()) {
            System.out.println("classRoomArrays" + iterator1.next());
        }

        ClassRoomList classRoom = new ClassRoomList(2);
        classRoom.addStudent(s1);
        classRoom.addStudent(s2);

        Iterator iterator = classRoom.iterator();
        while (iterator.hasNext()) {
            System.out.println("ClassRoomList" + iterator.next());
        }

    }
}
