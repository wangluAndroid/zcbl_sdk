package com.zcbl.client.zcblsdk.decoratormodel;

/**
 * Created by serenitynanian on 2018/2/8.
 */

public class DecoratorTest {

    public static void main(String[] args) {
        /**
         * 装饰的方法是：首先用ConcreteComponent实例化对象c，然后用ConcreteDecoratorA的实例化对象d1来包装c，
         * 再用ConcreteDecoratorB的实例化对象d2来包装d1，最终执行d2的operate()方法；
         */
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        //装饰过程
        d1.setComponent(c);
        d2.setComponent(d1);

        d2.operate();


    }
}
