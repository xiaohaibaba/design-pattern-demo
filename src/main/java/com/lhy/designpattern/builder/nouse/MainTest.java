package com.lhy.designpattern.builder.nouse;

public class MainTest {

    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("在filed1前 设置复杂属性1");
        p.setFiled1("1");
        System.out.println("在filed2前 设置复杂属性2");
        p.setFiled2("2");
        System.out.println("在filed3前 设置复杂属性3");
        p.setFiled3("3");
    }
}
