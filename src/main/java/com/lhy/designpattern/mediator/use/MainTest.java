package com.lhy.designpattern.mediator.use;


public class MainTest {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ModelA a = new ModelA(mediator);
        ModelB b = new ModelB(mediator);
        ModelC c = new ModelC(mediator);

        a.execute();
        b.execute();
        c.execute();
    }
}
