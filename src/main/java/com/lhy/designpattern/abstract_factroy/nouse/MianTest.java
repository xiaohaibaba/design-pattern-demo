package com.lhy.designpattern.abstract_factroy.nouse;


public class MianTest {

    public static void main(String[] args) {
        ProductA productA1 = new ProductA1();
        ProductB productB2 = new ProductB2();

        productA1.execute();
        productB2.execute();

        ProductA productA2 = new ProductA2();
        ProductB productB3 = new ProductB3();

        productA2.execute();
        productB3.execute();


    }
}
