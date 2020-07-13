package com.lhy.designpattern.factory_method.use;

public class Product1Factory extends AbstractProductFactory{
    private static final Product1Factory instance = new Product1Factory();

    public Product1Factory() {
    }

    public static Product1Factory getInstance(){
        return instance;
    }

    @Override
    public Product specialProduct() {
        System.out.println("产品1特殊逻辑");
        return new Product1();
    }
}
