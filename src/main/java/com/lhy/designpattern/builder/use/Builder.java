package com.lhy.designpattern.builder.use;

public interface Builder {
    void file1(String value);
    void file2(String value);
    void file3(String value);

    Product create();
}
