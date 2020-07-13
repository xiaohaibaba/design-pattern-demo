package com.lhy.designpattern.iterator.use;

/**
 * 定义一个自定义的迭代器类
 */
public interface Iterator<T> {
    //是否还有下一个元素
    boolean hasNext();

    // 下一个对象
    T next();
}
