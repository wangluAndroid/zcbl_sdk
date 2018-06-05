package com.zcbl.client.zcblsdk.templatemodel;

/**
 * Created by serenitynanian on 2018/6/5.
 */

public class Test {

    public static void main(String[] args) {
        AbstractTemplate abstractTemplate ;

        abstractTemplate = new ConcreteSubA();
        abstractTemplate.templateMethod();

        abstractTemplate = new ConcreteSubB();
        abstractTemplate.templateMethod();
    }
}
