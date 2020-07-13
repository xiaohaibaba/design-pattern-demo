package com.lhy.designpattern.facade.nouse;

public class MainTest {
    public static void main(String[] args) {
        ModlesA a = new ModlesA();
        ModlesB b = new ModlesB();
        ModlesC c = new ModlesC();

        a.execute();
        b.execute();
        c.execute();
    }
}
