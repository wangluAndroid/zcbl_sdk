package com.zcbl.client.zcblsdk.strategymodel;

/**
 * Created by serenitynanian on 2018/2/2.
 * 具体的算法A
 */

public class ConcreteStrategyA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现了");
    }
}
