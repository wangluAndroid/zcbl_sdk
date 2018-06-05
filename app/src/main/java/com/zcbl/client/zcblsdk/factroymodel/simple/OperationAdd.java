package com.zcbl.client.zcblsdk.factroymodel.simple;

/**
 * Created by serenitynanian on 2018/2/9.
 * 具体的加法实现类
 */

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = numA+numB;
        return result;
    }
}
