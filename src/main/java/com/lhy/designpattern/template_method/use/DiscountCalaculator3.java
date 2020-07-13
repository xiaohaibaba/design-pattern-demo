package com.lhy.designpattern.template_method.use;

public class DiscountCalaculator3 extends AbstractDiscountCalaculator {

    @Override
    public void specificCalaculator() {
        System.out.println("特殊优惠3");
    }
}
