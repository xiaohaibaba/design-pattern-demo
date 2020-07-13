package com.lhy.designpattern.adapter.object;

public class MainTest {

    public static void main(String[] args) {
        System.out.println("对象适配器测试");
        Target target = new Adapter(new Adaptee());
        target.request();
    }

}
