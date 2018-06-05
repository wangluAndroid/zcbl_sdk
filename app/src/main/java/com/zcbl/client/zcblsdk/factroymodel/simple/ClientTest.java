package com.zcbl.client.zcblsdk.factroymodel.simple;

/**
 * Created by serenitynanian on 2018/2/9.
 */

public class ClientTest {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.numA = 6 ;
        operation.numB = 2 ;
        double result = operation.getResult();
        System.out.println("----simple factory----result--->"+result);
    }
}
