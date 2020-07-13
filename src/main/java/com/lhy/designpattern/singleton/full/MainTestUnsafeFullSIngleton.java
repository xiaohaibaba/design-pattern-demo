package com.lhy.designpattern.singleton.full;


import com.lhy.designpattern.singleton.hungry.HungrySingleton;

public class MainTestUnsafeFullSIngleton {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                UnsafeFullSingleton instance = UnsafeFullSingleton.getInstance();
                System.out.println(instance);
            }).start();
        }

    }
}
