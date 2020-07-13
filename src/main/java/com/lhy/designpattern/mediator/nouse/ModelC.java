package com.lhy.designpattern.mediator.nouse;

public class ModelC {

    public void execute(){
        ModelA a = new ModelA();
        a.execute("模块C");
        ModelB b = new ModelB();
        b.execute("模块C");
    }
    public void execute(String invoke) {
        System.out.println(invoke +"在调动模块C");
    }

}
