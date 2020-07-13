package com.lhy.designpattern.template_method.nouse;

public class MainTest {
    public static void main(String[] args) {
        DiscountCalculator1 discountCalculator1 = new DiscountCalculator1();
        discountCalculator1.calculator();

        DiscountCalculator2 discountCalculator2 = new DiscountCalculator2();
        discountCalculator2.calculator();

        DiscountCalculator3 discountCalculator3 = new DiscountCalculator3();
        discountCalculator3.calculator();
    }
}
