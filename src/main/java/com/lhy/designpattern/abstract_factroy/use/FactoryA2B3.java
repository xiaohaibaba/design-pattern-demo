package com.lhy.designpattern.abstract_factroy.use;

public class FactoryA2B3 extends AbstractFactory{
    private static final FactoryA2B3 instance = new FactoryA2B3();

    public static FactoryA2B3 getInstance() {
        return instance;
    }
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB3();
    }
}
