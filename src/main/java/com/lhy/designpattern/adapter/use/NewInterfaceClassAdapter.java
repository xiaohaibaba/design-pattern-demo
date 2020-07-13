package com.lhy.designpattern.adapter.use;

/**
 * 类适配器
 */
public class NewInterfaceClassAdapter implements OldInterface, NewInterface{

    @Override
    public void newExecute() {
        this.oldExecute();
    }

    @Override
    public void oldExecute() {
        System.out.println("老版本接口实现");
    }
}
