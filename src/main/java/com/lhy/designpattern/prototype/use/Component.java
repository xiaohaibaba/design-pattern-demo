package com.lhy.designpattern.prototype.use;

public class Component {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Component component = new Component();
        component.setName(name);
        return component;
    }
}
