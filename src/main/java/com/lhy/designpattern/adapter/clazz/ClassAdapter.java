package com.lhy.designpattern.adapter.clazz;

public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specialRequest();
        System.out.println("自身业务代码");
    }
}
