package com.lhy.designpattern.prototype.use;


public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product();
        product.setName("测试产品");
        Component component = new Component();
        System.out.println(component);
        component.setName("测试组件");
        product.setComponent(component);
        System.out.println(product);

        Product clone = (Product)product.clone();

        System.out.println(clone);
        System.out.println(clone.getComponent());

    }
}
