package com.lhy.designpattern.mediator.nouse;

public class ModelB {

    public void execute(){
        ModelA a = new ModelA();
        a.execute("模块B");
        ModelC c = new ModelC();
        c.execute("模块B");
    }
    public void execute(String invoke){
        System.out.println(invoke +"在调动模块B");

    }
}
