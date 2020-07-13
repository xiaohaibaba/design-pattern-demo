package com.lhy.designpattern.singleton.hungry;

public class MainTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                HungrySingleton instance = HungrySingleton.getInstance();
                System.out.println(instance);
            }).start();
        }

    }
}
