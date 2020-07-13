package com.lhy.designpattern.adapter.nouse;

public class NewInterfaceImpl implements NewInterface {

    @Override
    public void newExecute() {
        System.out.println("新版本接口实现");
    }
}
