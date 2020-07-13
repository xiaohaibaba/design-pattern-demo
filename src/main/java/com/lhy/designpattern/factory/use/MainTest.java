package com.lhy.designpattern.factory.use;

public class MainTest {
    public static void main(String[] args) {
        Product product = ProductFactory.create();
        product.execute();
    }
}
