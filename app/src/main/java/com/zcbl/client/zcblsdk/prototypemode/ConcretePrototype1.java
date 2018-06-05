package com.zcbl.client.zcblsdk.prototypemode;

/**
 * Created by serenitynanian on 2018/2/11.
 */

public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1() {
        type = "ConcretePrototype1";
    }

    @Override
    void say() {
        System.out.println("------------ConcretePrototype1---------->"+type);
    }
}
