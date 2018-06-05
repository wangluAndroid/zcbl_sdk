package com.zcbl.client.zcblsdk.facademodel;

/**
 * Created by serenitynanian on 2018/6/5.
 * 由于Facade的作用，客户端可以根本不知道三个子系统类的存在的；
 *
 * 备注：外观模式完美的体现了依赖倒转原则（面向接口编程）和迪米特法则（最少知识原则）的思想
 */

public class Test {


    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodOne();
        facade.methodTwo();
        facade.methodThree();
    }
}
