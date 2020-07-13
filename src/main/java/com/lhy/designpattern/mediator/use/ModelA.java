package com.lhy.designpattern.mediator.use;

public class ModelA {

    private Mediator mediator;

    public ModelA(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModelA(this);
    }

    public void execute(){
        mediator.modelAInvok();
    }
    public void execute(String invoke){
        System.out.println(invoke +"在调动模块A");
    }
}
