package com.lhy.designpattern.mediator.use;

public class ModelB {

    private Mediator mediator;

    public ModelB(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModelB(this);
    }

    public void execute(){
        mediator.modelBInvok();
    }

    public void execute(String invoke){
        System.out.println(invoke +"在调动模块B");

    }
}
