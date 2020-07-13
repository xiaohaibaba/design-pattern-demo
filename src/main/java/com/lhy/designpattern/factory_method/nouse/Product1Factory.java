package com.lhy.designpattern.factory_method.nouse;

public class Product1Factory {

    public static Product create(){
        System.out.println("通用逻辑");
        System.out.println("产品1特殊 逻辑");
        return new Product1();
    }

}
