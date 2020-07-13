package com.lhy.designpattern.adapter.use;


public class OldInterfaceImpl implements OldInterface {

    @Override
    public void oldExecute() {
        System.out.println("老版本接口实现");
    }
}
