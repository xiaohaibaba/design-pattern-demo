package com.lhy.designpattern.builder.use;

public class ConcreteBuilder implements Builder{

    private Product p = new Product();

    @Override
    public void file1(String value) {
        System.out.println("在filed1前 设置复杂属性1");
        p.setFiled1(value);
    }

    @Override
    public void file2(String value) {
        System.out.println("在filed1前 设置复杂属性1");
        p.setFiled2(value);
    }

    @Override
    public void file3(String value) {
        System.out.println("在filed1前 设置复杂属性1");
        p.setFiled3(value);
    }

    @Override
    public Product create() {
        return p;
    }
}
