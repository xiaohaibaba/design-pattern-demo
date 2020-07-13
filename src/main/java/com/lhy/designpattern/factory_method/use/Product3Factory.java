package com.lhy.designpattern.factory_method.use;

public class Product3Factory extends AbstractProductFactory{
    private static final Product3Factory instance = new Product3Factory();

    public Product3Factory() {
    }

    public static Product3Factory getInstance(){
        return instance;
    }

    @Override
    public Product specialProduct() {
        System.out.println("产品3特殊逻辑");
        return new Product3();
    }
}
