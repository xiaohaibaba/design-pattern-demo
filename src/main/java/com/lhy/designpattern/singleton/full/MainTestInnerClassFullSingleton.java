package com.lhy.designpattern.singleton.full;

public class MainTestInnerClassFullSingleton {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                InnerClassFullSingleton instance = InnerClassFullSingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}
