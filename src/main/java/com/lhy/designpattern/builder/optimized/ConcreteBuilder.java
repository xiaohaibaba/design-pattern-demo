package com.lhy.designpattern.builder.optimized;

public class ConcreteBuilder implements Builder {

    private Product p = new Product();

    @Override
    public Builder file1(String value) {
        System.out.println("在filed1前 设置复杂属性1");
        p.setFiled1(value);
        return this;
    }

    @Override
    public Builder file2(String value) {
        System.out.println("在filed1前 设置复杂属性1");
        p.setFiled2(value);
        return this;
    }

    @Override
    public Builder file3(String value) {
        System.out.println("在filed1前 设置复杂属性1");
        p.setFiled3(value);
        return this;
    }

    @Override
    public Product create() {
        return p;
    }
}
