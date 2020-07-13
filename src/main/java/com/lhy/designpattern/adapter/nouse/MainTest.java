package com.lhy.designpattern.adapter.nouse;

public class MainTest {
    public static void main(String[] args) {
        OldInterface old = new OldInterfaceImpl();
        NewInterface news = new NewInterfaceImpl();
        old.oldExecute();
        news.newExecute();
    }
}