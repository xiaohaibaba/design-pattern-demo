package com.lhy.designpattern.mediator.nouse;

public class ModelA {

    public void execute(){
        ModelB b = new ModelB();
        b.execute("模块A");
        ModelC c = new ModelC();
        c.execute("模块A");
    }
    public void execute(String invoke){
        System.out.println(invoke +"在调动模块A");
    }
}
