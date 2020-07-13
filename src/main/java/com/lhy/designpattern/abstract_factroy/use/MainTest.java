package com.lhy.designpattern.abstract_factroy.use;

public class MainTest {
    public static void main(String[] args) {
        ProductA productA = FactoryA1B1.getInstance().createProductA();
        ProductB productB = FactoryA1B1.getInstance().createProductB();
        productA.execute();
        productB.execute();

        ProductA productA1 = FactoryA1B2.getInstance().createProductA();
        ProductB productB2 = FactoryA1B2.getInstance().createProductB();
        productA1.execute();
        productB2.execute();

        ProductA productA2 = FactoryA2B3.getInstance().createProductA();
        ProductB productB3 = FactoryA2B3.getInstance().createProductB();
        productA2.execute();
        productB3.execute();
    }
}
