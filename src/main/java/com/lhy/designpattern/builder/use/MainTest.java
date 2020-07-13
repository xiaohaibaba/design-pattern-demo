package com.lhy.designpattern.builder.use;

public class MainTest {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());

        Product builde = director.builde("值1", "值2", "值3");
        System.out.println(builde);

    }
}
