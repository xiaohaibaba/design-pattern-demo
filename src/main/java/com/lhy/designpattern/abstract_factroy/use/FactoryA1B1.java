package com.lhy.designpattern.abstract_factroy.use;

public class FactoryA1B1 extends AbstractFactory{

    private static final FactoryA1B1 instance = new FactoryA1B1();

    public static FactoryA1B1 getInstance() {
        return instance;
    }
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
