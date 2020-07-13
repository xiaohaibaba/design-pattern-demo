package com.lhy.designpattern.factory_method.nouse;

public class MainTest {

    public static void main(String[] args) {
        Product product1 = Product1Factory.create();
        Product product2 = Product2Factory.create();
        Product product3 = Product3Factory.create();
        product1.execute();
        product2.execute();
        product3.execute();
    }
}
