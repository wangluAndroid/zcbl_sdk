package com.zcbl.client.zcblsdk.prototypemode;

/**
 * Created by serenitynanian on 2018/2/11.
 */

public class PrototypeClientTest {
    public static void main(String[] args){

        ConcretePrototype1 p1 = new ConcretePrototype1();
        p1.type = "ConcretePrototype1-----p1";
        ConcretePrototype1 p2 = (ConcretePrototype1) p1.clone();
        p2.type = "ConcretePrototype1-----p2";

        p1.say();
        p2.say();
        /**
         * 打印结果如下：
         * ------------ConcretePrototype1---------->ConcretePrototype1-----p1
         * ------------ConcretePrototype1---------->ConcretePrototype1-----p2
         */

    }
}
