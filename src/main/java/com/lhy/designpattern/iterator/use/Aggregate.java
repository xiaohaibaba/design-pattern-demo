package com.lhy.designpattern.iterator.use;

public interface Aggregate<T> {

    Iterator<T> iterator();
}
