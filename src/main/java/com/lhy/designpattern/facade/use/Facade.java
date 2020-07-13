package com.lhy.designpattern.facade.use;

import com.lhy.designpattern.facade.nouse.ModlesA;
import com.lhy.designpattern.facade.nouse.ModlesB;
import com.lhy.designpattern.facade.nouse.ModlesC;

public class Facade {

    public void execute(){
        com.lhy.designpattern.facade.nouse.ModlesA a = new ModlesA();
        com.lhy.designpattern.facade.nouse.ModlesB b = new ModlesB();
        com.lhy.designpattern.facade.nouse.ModlesC c = new ModlesC();
        a.execute();
        b.execute();
        c.execute();
    }

}
