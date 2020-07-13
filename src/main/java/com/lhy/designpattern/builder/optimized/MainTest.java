package com.lhy.designpattern.builder.optimized;

public class MainTest {
    public static void main(String[] args) {
        Product product = new ConcreteBuilder().file1("1").file3("3").create();
        System.out.println(product);
    }

}
