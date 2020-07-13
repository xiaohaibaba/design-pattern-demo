package com.lhy.designpattern.mediator.nouse;

public class MianTest {
    public static void main(String[] args) {
        ModelA a = new ModelA();
        ModelB b = new ModelB();
        ModelC c = new ModelC();

        a.execute();
        b.execute();
        c.execute();
    }
}
