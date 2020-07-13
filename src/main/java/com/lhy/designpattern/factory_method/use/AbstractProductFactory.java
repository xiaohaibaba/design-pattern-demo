package com.lhy.designpattern.factory_method.use;

public abstract class AbstractProductFactory {

    public Product createProduct() {
        commomProduct();
        return specialProduct();
    }

    private void commomProduct() {
        System.out.println("普通逻辑");
    }

    public abstract Product specialProduct();
}
