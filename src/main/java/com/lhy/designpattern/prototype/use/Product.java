package com.lhy.designpattern.prototype.use;


public class Product {
    private String name;
    private Component component;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        // 浅拷贝
//        Product product = new Product();
//        product.setName(name);
//        product.setComponent(component);
        // 深拷贝
        Product product = new Product();
        product.setName(name);
        product.setComponent((Component) component.clone());
        return product;
    }
}
