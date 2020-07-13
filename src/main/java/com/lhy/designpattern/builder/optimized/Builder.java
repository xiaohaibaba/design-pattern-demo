package com.lhy.designpattern.builder.optimized;


public interface Builder {

    Builder file1(String value);
    Builder file2(String value);
    Builder file3(String value);

    Product create();
}
