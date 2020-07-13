package com.lhy.designpattern.template_method.use;

public abstract class AbstractDiscountCalaculator implements DiscountCalaculator {

    @Override
    public void calaculator() {
        //通用优惠
        commondCalaculator();
        //特殊优惠
        specificCalaculator();
    }

    /**
     * 通用优惠
     */
    public void commondCalaculator(){
        System.out.println("通用优惠,修改了");
    }

    /**
     * 特殊优惠，由子类具体实现
     */
    public abstract void specificCalaculator();
}
