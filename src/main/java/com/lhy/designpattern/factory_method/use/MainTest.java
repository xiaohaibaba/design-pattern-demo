package com.lhy.designpattern.factory_method.use;

public class MainTest {
    public static void main(String[] args) {
        Product product = Product1Factory.getInstance().createProduct();
        product.execute();

        Product product2 = Product2Factory.getInstance().createProduct();
        product2.execute();

        Product product3 = Product3Factory.getInstance().createProduct();
        product3.execute();
    }
}
