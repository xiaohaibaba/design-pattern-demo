package com.lhy.designpattern.mediator.use;

public class ModelC {
    private Mediator mediator;

    public ModelC(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModelC(this);
    }
    public void execute(){
        mediator.modelCInvok();
    }
    public void execute(String invoke) {
        System.out.println(invoke +"在调动模块C");
    }

}
