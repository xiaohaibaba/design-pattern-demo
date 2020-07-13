package com.lhy.designpattern.builder.use;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product builde(String filed1, String filed2, String filed3) {
        builder.file1(filed1);
        builder.file2(filed2);
        builder.file3(filed3);
        return builder.create();
    }
}
