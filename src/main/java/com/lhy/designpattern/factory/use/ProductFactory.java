package com.lhy.designpattern.factory.use;

public class ProductFactory {

    public static Product create(){
        return new ProductImpl();
    }
}
