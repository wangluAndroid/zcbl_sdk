package com.zcbl.client.zcblsdk.factroymodel;

import com.zcbl.client.zcblsdk.factroymodel.simple.Operation;

/**
 * Created by serenitynanian on 2018/2/9.
 */

public class FactoryMethodClientTest {
    public static void main(String[] args) {
        //如果需要创建不同的产品，使用不同的工厂类即可
        IFactory iFactory = new AddFactory();

        //以下都不变
        Operation operation = iFactory.createOperation();
        operation.numA = 9 ;
        operation.numB = 2 ;
        double res = operation.getResult();
        System.out.println("-------factory method----result---->"+res);
    }
}
