package com.lhy.designpattern.adapter.object;

public class Adapter implements Target{

    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.specialRequest();
        System.out.println("自身业务逻辑");
    }
}
