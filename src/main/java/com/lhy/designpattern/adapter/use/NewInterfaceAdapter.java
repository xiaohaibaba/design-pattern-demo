package com.lhy.designpattern.adapter.use;

/**
 * 对象适配器
 */
public class NewInterfaceAdapter implements NewInterface {

    private OldInterface oldInterface;

    public NewInterfaceAdapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void newExecute() {
        oldInterface.oldExecute();
    }
}
