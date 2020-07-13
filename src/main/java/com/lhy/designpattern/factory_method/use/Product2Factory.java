package com.lhy.designpattern.factory_method.use;

public class Product2Factory extends AbstractProductFactory{
    private static final Product2Factory instance = new Product2Factory();

    public Product2Factory() {
    }

    public static Product2Factory getInstance(){
        return instance;
    }

    @Override
    public Product specialProduct() {
        System.out.println("产品2特殊逻辑");
        return new Product2();
    }
}
