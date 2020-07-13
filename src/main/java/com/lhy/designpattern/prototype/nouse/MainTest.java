package com.lhy.designpattern.prototype.nouse;

public class MainTest {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("测试产品");
        Component component = new Component();
        component.setName("测试组件");
        product.setComponent(component);
        System.out.println(product);

        Product copyProduct = new Product();
        copyProduct.setName(product.getName());
        copyProduct.setComponent(product.getComponent());
        System.out.println(copyProduct);
    }
}
