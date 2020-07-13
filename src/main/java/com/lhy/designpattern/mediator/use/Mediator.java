package com.lhy.designpattern.mediator.use;

public class Mediator {

    private ModelA modelA;
    private ModelB modelB;
    private ModelC modelC;

    public ModelA getModelA() {
        return modelA;
    }

    public void setModelA(ModelA modelA) {
        this.modelA = modelA;
    }

    public ModelB getModelB() {
        return modelB;
    }

    public void setModelB(ModelB modelB) {
        this.modelB = modelB;
    }

    public ModelC getModelC() {
        return modelC;
    }

    public void setModelC(ModelC modelC) {
        this.modelC = modelC;
    }

    public void modelAInvok(){
        modelB.execute("模块A 通知中介者");
        modelC.execute("模块A 通知中介者");
    }
    public void modelBInvok(){
        modelA.execute("模块B 通知中介者");
        modelC.execute("模块B 通知中介者");
    }
    public void modelCInvok(){
        modelB.execute("模块C 通知中介者");
        modelA.execute("模块C 通知中介者");
    }
}
