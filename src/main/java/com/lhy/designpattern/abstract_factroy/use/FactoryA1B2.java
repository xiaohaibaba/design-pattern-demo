package com.lhy.designpattern.abstract_factroy.use;

public class FactoryA1B2 extends AbstractFactory{
    private static final FactoryA1B2 instance = new FactoryA1B2();

    public static FactoryA1B2 getInstance() {
        return instance;
    }
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
