package com.lhy.designpattern.singleton.full;

public class UnsafeFullSingleton {
    private static UnsafeFullSingleton instance;

    private UnsafeFullSingleton(){}

    public static UnsafeFullSingleton getInstance() {
        if (instance == null) {
            instance = new UnsafeFullSingleton();
        }
        return instance;
    }
}
