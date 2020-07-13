package com.lhy.designpattern.template_method.use;

public class MainTest {
    public static void main(String[] args) {
        DiscountCalaculator discountCalaculator1 = new DiscountCalaculator1();
        discountCalaculator1.calaculator();

        DiscountCalaculator discountCalaculator2 = new DiscountCalaculator2();
        discountCalaculator2.calaculator();

        DiscountCalaculator discountCalaculator3 = new DiscountCalaculator3();
        discountCalaculator3.calaculator();
    }
}
