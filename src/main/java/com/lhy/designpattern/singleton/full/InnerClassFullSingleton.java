package com.lhy.designpattern.singleton.full;

public class InnerClassFullSingleton {

    private InnerClassFullSingleton(){}

    /**
     * 可以保证是饱汉模式
     * 内部类，只要没有被使用，就不会初始化，InnerClassFullSingleton的实例就不会被创建
     * 在第一次调用getInstance的时候，就会被创建
     * 内部类只会执行一次
     */
    public static class InnerHolder {
        // 这里虽然是饿汉 进行new的
        public static final InnerClassFullSingleton instance = new InnerClassFullSingleton();
    }

    public static InnerClassFullSingleton getInstance(){
        return InnerHolder.instance;
    }
}
