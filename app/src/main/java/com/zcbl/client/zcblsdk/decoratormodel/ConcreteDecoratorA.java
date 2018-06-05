package com.zcbl.client.zcblsdk.decoratormodel;

/**
 * Created by serenitynanian on 2018/2/8.
 * 具体的装饰对象，起到给Component添加职责功能。
 */

public class ConcreteDecoratorA extends Decorate {

    private String addedState ;

    @Override
    public void operate() {
        //首先运行父类的Component的operate方法，在执行本类的功能，如addedState,相当于对Component进行了装饰；
        super.operate();
        addedState = "New Stated";
        System.out.println("具体的装饰对象A的操作");
    }
}
