package com.zcbl.client.zcblsdk.factroymodel.simple;

/**
 * Created by serenitynanian on 2018/2/9.
 * 简单的工厂运算类
 */

public class OperationFactory {

    public static Operation createOperation(String operation) {
        Operation ope = null ;

        switch (operation) {
            case "+":
                ope = new OperationAdd();
                break ;
            case "-":
                ope = new OperationSub();
                break ;
            case "*":
                break ;
            case "/":
                ope = new OperationDiv();
                break ;

        }
        return ope;
    }
}
