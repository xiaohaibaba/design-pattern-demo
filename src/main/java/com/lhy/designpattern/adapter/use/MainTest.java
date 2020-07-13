package com.lhy.designpattern.adapter.use;

/**
 * 对象适配器模式
 */
public class MainTest {
    public static void main(String[] args) {
        // 对象适配器
        NewInterface old = new NewInterfaceAdapter(new OldInterfaceImpl());
        old.newExecute();

        NewInterface news = new NewInterfaceImpl();
        news.newExecute();



        //类适配器
        NewInterface olds = new NewInterfaceClassAdapter();
        olds.newExecute();


    }
}
