package com.zcbl.client.zcblsdk.decoratormodel;

/**
 * Created by serenitynanian on 2018/2/8.
 */

public class ConcreteDecoratorB extends Decorate {

    @Override
    public void operate() {
        //首先运行父类的Component的operate方法，在执行本类的功能，如addedBehavior(),相当于对Component进行了装饰；
        super.operate();
        addedBehavior();
    }

    /**
     * 本类独有的方法，以区别于ConcreteDecoratorA
     */
    private void addedBehavior() {

        System.out.println("----------addedBehavior--------");

    }
}
