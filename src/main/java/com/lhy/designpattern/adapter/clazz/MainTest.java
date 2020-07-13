package com.lhy.designpattern.adapter.clazz;

/**
 * 类适配器
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("类适配器测试");
        Target target = new ClassAdapter();
        target.request();

    }
}
