package com.lhy.designpattern.singleton.full;

public class MainTestSafeFullSingleton {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                SafeFullSingleton instance = SafeFullSingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}
