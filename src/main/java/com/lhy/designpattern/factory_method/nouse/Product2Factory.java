package com.lhy.designpattern.factory_method.nouse;

public class Product2Factory {

    public static Product create(){
        System.out.println("通用逻辑");
        System.out.println("产品2特殊 逻辑");
        return new Product2();
    }

}
