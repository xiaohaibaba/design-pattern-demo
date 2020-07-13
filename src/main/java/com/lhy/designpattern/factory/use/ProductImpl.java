package com.lhy.designpattern.factory.use;

public class ProductImpl implements Product{
    @Override
    public void execute() {
        System.out.println("产品1");
    }
}
